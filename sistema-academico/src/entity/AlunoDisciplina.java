package entity;

import entity.enums.StatusAluno;

import java.util.Map;

public class AlunoDisciplina implements InterfaceIdentificador {
    private Long id;
    private Aluno aluno;
    private Disciplina disciplina;
    private Map<Integer, Double> notas;
    private StatusAluno status;

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(Long id, Aluno aluno, Disciplina disciplina, Map<Integer, Double> notas) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.notas = notas;
        this.status = StatusAluno.INDEFINIDO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Map<Integer, Double> getNotas() {
        return notas;
    }

    public void setNotas(Map<Integer, Double> notas) {
        this.notas = notas;
    }

    public StatusAluno getStatus() {
        return status;
    }

    public void setStatus(StatusAluno status) {
        this.status = status;
    }
}
