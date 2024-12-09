package models;

public class utils {

    public static Pessoa.Sexo obterSexo(String sexoAsString) {
        if (sexoAsString.equalsIgnoreCase("M")) {
            return Pessoa.Sexo.MASCULINO;
        } else if (sexoAsString.equalsIgnoreCase("F")) {
            return Pessoa.Sexo.FEMININO;
        } else {
            return Pessoa.Sexo.OUTRO;
        }
    }

    public static void resetarReserva(Reserva reserva) {
        reserva.setQuantidadeDiaria(0);
        System.out.println("\n💼 Dados da reserva resetados com sucesso.");
    }
}
