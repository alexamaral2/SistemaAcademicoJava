package entity;

import java.util.Map;

public class AlunoDisciplina {
    private Integer id;
    private Aluno aluno;
    private Disciplina disciplina;
    private Map<Integer, Double> notas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
