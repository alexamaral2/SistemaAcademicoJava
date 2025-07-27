package entity;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("===== Dados do Aluno =====");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("==========================");
    }

}
