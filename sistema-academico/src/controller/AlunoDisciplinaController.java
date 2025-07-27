package controller;

import entity.Aluno;
import entity.AlunoDisciplina;
import entity.Disciplina;
import entity.enums.StatusAluno;
import service.AlunoDisciplinaService;

import java.util.List;
import java.util.Map;

public class AlunoDisciplinaController {
    private AlunoDisciplinaService alunoDisciplinaService;

    public AlunoDisciplinaController(AlunoDisciplinaService alunoDisciplinaService) {
        this.alunoDisciplinaService = alunoDisciplinaService;
    }

    public void adicionar(Aluno aluno, Disciplina disciplina, Map<Integer, Double> notas) {
        AlunoDisciplina ad = new AlunoDisciplina();
        ad.setAluno(aluno);
        ad.setDisciplina(disciplina);
        ad.setNotas(notas);

        alunoDisciplinaService.cadastrar(ad);
    }

    public List<AlunoDisciplina> listar() {
        return alunoDisciplinaService.listar();
    }

    public AlunoDisciplina exibir(int id) {
        return alunoDisciplinaService.consultar(id);
    }

    public StatusAluno consultarAprovacao(AlunoDisciplina alunoDisciplina){
        return alunoDisciplinaService.avaliarStatus(alunoDisciplina);
    }
}
