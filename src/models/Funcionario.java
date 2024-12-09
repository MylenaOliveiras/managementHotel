package models;

import java.util.Scanner;

import static models.utils.obterSexo;

public class Funcionario extends Pessoa implements Cadastravel {
    private String cargo;
    private String dataAdmissao;
    private String salario;
    private String departamento;

    public Funcionario(String nomeCompleto, String dataNascimento, String cpf, Sexo sexo, String email, String telefone, String endereco, String cargo, String dataAdmissao, String salario, String departamento) {
        super(nomeCompleto, dataNascimento, cpf, sexo, email, telefone, endereco);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cadastro de Funcionário ---");

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

        System.out.print("Cargo do novo funcionário: ");
        String cargo = scanner.nextLine();
        setCargo(cargo);

        System.out.print("Data admissão: ");
        String dataAdmissao = scanner.nextLine();
        setDataAdmissao(dataAdmissao);

        System.out.print("Salário: ");
        String salario = scanner.nextLine();
        setSalario(salario);

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        setDepartamento(departamento);
    }
}
