package controller;

import entity.Disciplina;
import service.DisciplinaService;

import java.util.List;

public class DisciplinaController {
    private DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    public void adicionar(String nome) {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);

        disciplinaService.cadastrar(disciplina);
    }

    public List<Disciplina> listar() {
        return disciplinaService.listar();
    }

    public Disciplina exibir(int id) {
        return disciplinaService.consultar(id);
    }
}

