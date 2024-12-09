package models;

import java.util.Scanner;

import static models.utils.resetarReserva;

public class Reserva {
    private int numeroReserva;
    private Hospede hospede;
    private Quarto quarto;
    private String dataHoraCheckIn;
    private String dataHoraCheckOut;
    private String formaPagamento;
    private double valorTotal;
    private int quantidadeDiaria;

    public Reserva(int numeroReserva, Hospede hospede, Quarto quarto, String dataHoraCheckIn, String dataHoraCheckOut, String formaPagamento, double valorTotal, int quantidadeDiaria) {
        this.quarto = quarto;
        this.dataHoraCheckIn = dataHoraCheckIn;
        this.dataHoraCheckOut = dataHoraCheckOut;
        this.numeroReserva = numeroReserva;
        this.hospede = hospede;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.quantidadeDiaria = quantidadeDiaria;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public String getDataHoraCheckIn() {
        return dataHoraCheckIn;
    }

    public String getDataHoraCheckOut() {
        return dataHoraCheckOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public int getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    public void setQuantidadeDiaria(int quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }

    public static double calcularValorTotal(Quarto quarto, int diasReserva) {
        return quarto.precoDiaria * diasReserva;
    }

    public static Reserva novaReserva(Hospede hospede, Quarto quarto) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Nova reserva ---");

        System.out.print("Número da Reserva: ");
        int numeroReserva = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Data e Hora de Check-In (dd/mm/yyyy hh:mm): ");
        String dataHoraCheckIn = scanner.nextLine();

        System.out.print("Data e Hora de Check-Out (dd/mm/yyyy hh:mm): ");
        String dataHoraCheckOut = scanner.nextLine();

        System.out.print("Quantidades de dias no total: ");
        int quantidadeDiaria = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Forma de Pagamento: ");
        String formaPagamento = scanner.nextLine();

        double valorTotal = calcularValorTotal(quarto, quantidadeDiaria);

        System.out.print("Confirmar reserva? (Sim/Não) ");
        String resposta = scanner.nextLine();

        boolean reservaConfirmada = resposta.equalsIgnoreCase("Sim");

        Reserva reserva = new Reserva(numeroReserva, hospede, quarto, dataHoraCheckIn, dataHoraCheckOut, formaPagamento, valorTotal, quantidadeDiaria);

        if (reservaConfirmada) {
            quarto.setDisponivel(false);
            System.out.println("\n✅ Reserva confirmada com sucesso: " + hospede.getNomeCompleto() + "\n");
        } else {
            resetarReserva(reserva);
        }
        return reserva;
    }
}
