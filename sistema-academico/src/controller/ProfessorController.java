package controller;

import entity.Professor;
import service.ProfessorService;

import java.util.List;

public class ProfessorController {
    private ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public void adicionar(String nome, String area) {
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setFormacao(area);

        professorService.cadastrar(professor);
    }

    public List<Professor> listar() {
        return professorService.listar();
    }

    public Professor exibir(int id) {
        return professorService.consultar(id);
    }
}
