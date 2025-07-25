package entity;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
    }

}
