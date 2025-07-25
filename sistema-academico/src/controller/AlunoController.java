package controller;

import entity.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public void cadastrarAluno(String nome, String cpf, String email, String matricula) {
        Aluno aluno = new Aluno(nome, cpf, email, matricula);
        alunoService.CadastrarAluno(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }
}
