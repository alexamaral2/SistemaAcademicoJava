package service;

import entity.Aluno;
import repository.AlunoRepository;

public class AlunoService extends GenericService<Aluno> {

    public AlunoService(AlunoRepository alunoRepository) {
        super(alunoRepository);
    }

}