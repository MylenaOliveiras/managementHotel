import models.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hospede hospede;
    private static Quarto quarto;
    private static Reserva reserva;

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();

            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Cadastravel funcionario = new Funcionario("", "", "", Pessoa.Sexo.OUTRO, "", "", "", "", "", "", "");
                    funcionario.cadastrar();
                    System.out.println("\n✅ Funcionário cadastrado com sucesso: " + ((Funcionario) funcionario).getNomeCompleto() + "\n");
                    break;
                case 2:
                    hospede = new Hospede("", "", "", Pessoa.Sexo.OUTRO, "", "", "");
                    hospede.cadastrar();
                    System.out.println("\n✅ Hóspede cadastrado com sucesso: " + hospede.getNomeCompleto() + "\n");
                    break;
                case 3:
                    quarto = Quarto.escolherQuarto();
                    System.out.println("\n✅ Ótima escolha: " + quarto.tipo + " tem tudo que você precisa!\n");
                    break;
                case 4:
                    if (hospede != null && quarto != null) {
                        reserva = Reserva.novaReserva(hospede, quarto);
                        System.out.println("\n✅ Reserva confirmada com sucesso: " + hospede.getNomeCompleto() + "\n");
                    } else {
                        System.out.println("\n⚠️ Antes de fazer a reserva, cadastre o hóspede e escolha o quarto!\n");
                    }
                    break;
                case 5:
                    if (reserva != null) {
                        CheckIn.realizarCheckIn(reserva);
                    } else {
                        System.out.println("\n⚠️ Não há reserva para realizar o check-in!\n");
                    }
                    break;
                case 6:
                    if (reserva != null) {
                        CheckOut.realizarCheckout(reserva);
                    } else {
                        System.out.println("\n⚠️ Não há reserva para realizar o check-out!\n");
                    }
                    break;
                case 7:
                    if (reserva != null) {
                        Relatorio.gerarRelatorio(reserva);
                    } else {
                        System.out.println("\n⚠️ Não há reserva para gerar relatório!\n");
                    }
                    break;
                case 8:
                    continuar = false;
                    System.out.println("\n👋 Saindo do sistema... Até logo!\n");
                    break;
                default:
                    System.out.println("\n⚠️ Opção inválida! Tente novamente.\n");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("====================================");
        System.out.println("      🏨 Hotel Bella Vista 🏨      ");
        System.out.println("====================================");
        System.out.println("1️⃣  Cadastrar Funcionário");
        System.out.println("2️⃣  Cadastrar Hóspede");
        System.out.println("3️⃣  Escolher Quarto");
        System.out.println("4️⃣  Confirmar Reserva");
        System.out.println("5️⃣  Realizar Check-In");
        System.out.println("6️⃣  Realizar Check-Out");
        System.out.println("7️⃣  Gerar Relatório");
        System.out.println("8️⃣  Sair");
        System.out.println("====================================");
    }
}
