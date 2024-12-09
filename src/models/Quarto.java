package models;

import java.util.Scanner;

public class Quarto {
    public int numeroQuarto;
    public TipoQuarto tipo;
    public double precoDiaria;
    public boolean disponivel = true;

    public enum TipoQuarto {
        STANDARD,
        LUXO,
        SUITE,
        FAMILIA,
    }

    public Quarto(int numeroQuarto, TipoQuarto tipo, double precoDiaria, boolean disponivel) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    public static double getPrecoDiaria(TipoQuarto tipo) {
        return switch (tipo) {
            case STANDARD -> 100.0;
            case LUXO -> 250.0;
            case SUITE -> 150.0;
            case FAMILIA -> 200.0;
        };
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public static Quarto escolherQuarto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de quarto:");
        System.out.println("1 - STANDARD: R$100,00 a diaria");
        System.out.println("2 - LUXO: R$250,00 a diária");
        System.out.println("3 - SUITE: R$150,00 a diária");
        System.out.println("4 - FAMILIA: R$200,00 a diária");


        int escolha = scanner.nextInt();
        TipoQuarto tipoEscolhido;

        switch (escolha) {
            case 1:
                tipoEscolhido = TipoQuarto.STANDARD;
                break;
            case 2:
                tipoEscolhido = TipoQuarto.LUXO;
                break;
            case 3:
                tipoEscolhido = TipoQuarto.SUITE;
                break;
            case 4:
                tipoEscolhido = TipoQuarto.FAMILIA;
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                scanner.close();
                return null;
        }

        System.out.println("Você escolheu o tipo de quarto: " + tipoEscolhido);
        double preco = getPrecoDiaria(tipoEscolhido);
        return new Quarto(30, tipoEscolhido, preco, true);
    }
}
