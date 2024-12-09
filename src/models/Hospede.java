package models;

import java.util.Scanner;

import static models.utils.obterSexo;

public class Hospede extends Pessoa implements Cadastravel {
    public Hospede(String nomeCompleto, String dataNascimento, String cpf, Sexo sexo, String email, String telefone, String endereco) {
        super(nomeCompleto, dataNascimento, cpf, sexo, email, telefone, endereco);
    }

    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cadastro de Hóspede ---");

        System.out.print("Nome Completo: ");
        String nome = scanner.nextLine();
        setNomeCompleto(nome);

        System.out.print("Data de nascimento (dd/mm/yyyy): ");
        String dataNascimento = scanner.nextLine();
        setDataNascimento(dataNascimento);

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        setCpf(cpf);

        System.out.print("Sexo (M/F): ");
        String sexoAsString = scanner.nextLine();
        Sexo sexo = obterSexo(sexoAsString);
        setSexo(sexo);

        System.out.print("Email: ");
        String email = scanner.nextLine();
        setEmail(email);

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        setTelefone(telefone);

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        setEndereco(endereco);
    }
}
