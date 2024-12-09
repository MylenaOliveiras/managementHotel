package models;

import java.util.Scanner;

import static models.utils.resetarReserva;

public class CheckOut {

    public static void realizarCheckout(Reserva reserva) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n📅 Realizando check-out da reserva número: " + reserva.getNumeroReserva());
        System.out.println("Hóspede: " + reserva.getHospede().getNomeCompleto());
        System.out.println("Quarto: " + reserva.getQuarto().tipo);
        System.out.println("Data de Check-In: " + reserva.getDataHoraCheckIn());
        System.out.println("Data de Check-Out: " + reserva.getDataHoraCheckOut());

        System.out.print("\n⚠️ Existe custo adicional? (s/n): ");
        String resposta = scanner.nextLine().toLowerCase();

        if (resposta.equals("s")) {
            System.out.print("Informe o valor adicional: R$ ");
            double custoAdicional = scanner.nextDouble();
            scanner.nextLine();

            double valorTotal = reserva.getValorTotal();
            valorTotal += custoAdicional;

            System.out.println("\n💰 Custo adicional de R$ " + custoAdicional + " adicionado.");
            System.out.println("Total a pagar: R$ " + valorTotal);
        } else {
            System.out.println("\n✅ Não há custo adicional. O valor total da reserva já foi pago.");
        }

        System.out.println("\n✅ Check-out realizado com sucesso! Obrigado e esperamos vê-lo novamente em breve.");
    }
}
