package entity;

public class Disciplina {
    private Long id;
    private String nome;
    private Professor professor;
    private PeriodoLetivo periodoLetivo;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, Professor professor) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
