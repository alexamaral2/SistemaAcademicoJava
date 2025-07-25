package service;

import entity.Aluno;
import repository.AlunoRepository;

import java.util.List;

public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void CadastrarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }
}
