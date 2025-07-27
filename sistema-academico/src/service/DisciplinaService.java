package service;

import entity.Disciplina;
import repository.DisciplinaRepository;

public class DisciplinaService extends GenericService<Disciplina> {
    public DisciplinaService(DisciplinaRepository repository) {
        super(repository);
    }
}
