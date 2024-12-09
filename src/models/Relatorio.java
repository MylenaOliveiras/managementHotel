package models;

public class Relatorio {

    public static void gerarRelatorio(Reserva reserva) {
        if (reserva == null) {
            System.out.println("Reserva inválida. Nenhum relatório pode ser gerado.");
            return;
        }

        System.out.println("\n--- Relatório de Reserva ---");
        System.out.println("Número da Reserva: " + reserva.getNumeroReserva());
        System.out.println("Nome do Hóspede: " + reserva.getHospede().getNomeCompleto());
        System.out.println("Quarto: " + reserva.getQuarto().numeroQuarto + " - Tipo: " + reserva.getQuarto().tipo);
        System.out.println("Data e Hora de Check-In: " + reserva.getDataHoraCheckIn());
        System.out.println("Data e Hora de Check-Out: " + reserva.getDataHoraCheckOut());
        System.out.print("Dias no total: " + reserva.getQuantidadeDiaria());
        System.out.println("Forma de Pagamento: " + reserva.getFormaPagamento());
        System.out.println("Valor Total da Reserva: R$ " + reserva.getValorTotal());
        System.out.println("-----------------------------------");
    }
}
