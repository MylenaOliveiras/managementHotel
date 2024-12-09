package models;

import java.util.Scanner;

public class CheckIn {

    public static void realizarCheckIn(Reserva reserva) {
        if (reserva == null) {
            System.out.println("Reserva não encontrada. Não é possível realizar o check-in.");
            return;
        }

        System.out.println("\n--- Realizando Check-In ---");
        System.out.println("Número da Reserva: " + reserva.getNumeroReserva());
        System.out.println("Hóspede: " + reserva.getHospede().getNomeCompleto());
        System.out.println("Quarto: " + reserva.getQuarto().numeroQuarto);
        System.out.println("Data de Check-In: " + reserva.getDataHoraCheckIn());
        System.out.println("Data de Check-Out: " + reserva.getDataHoraCheckOut());

    }
}
