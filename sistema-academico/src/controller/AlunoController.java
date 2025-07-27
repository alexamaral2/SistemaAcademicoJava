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
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        aluno.setEmail(email);
        aluno.setCpf(cpf);

        alunoService.cadastrar(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoService.listar();
    }

    public Aluno exibirAluno(int id) {
        return alunoService.consultar(id);
    }
}
