package application;

import controller.AlunoController;
import entity.Aluno;
import repository.AlunoRepository;
import service.AlunoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepository = new AlunoRepository();
        AlunoService alunoService = new AlunoService(alunoRepository);
        AlunoController alunoController = new AlunoController(alunoService);

        alunoController.cadastrarAluno("Alex","01234","alex@alex.com", "2025");
        List<Aluno> alunos = alunoController.listarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
