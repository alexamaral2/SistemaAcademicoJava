package service;

import entity.Professor;
import repository.ProfessorRepository;

public class ProfessorService extends GenericService<Professor> {
    public ProfessorService(ProfessorRepository repository) {
        super(repository);
    }
}
