package service;

import entity.AlunoDisciplina;
import entity.enums.StatusAluno;
import repository.AlunoDisciplinaRepository;

public class AlunoDisciplinaService extends GenericService<AlunoDisciplina> {
    public AlunoDisciplinaService(AlunoDisciplinaRepository repository) {
        super(repository);
    }

    public StatusAluno avaliarStatus(AlunoDisciplina ad) {
        double soma = 0.0;
        double media = 0.0;
        for (double nota : ad.getNotas().values()) {
            soma += nota;
        }
        media = soma / ad.getNotas().size();
        if (media >= 7.0) {
            ad.setStatus(StatusAluno.APROVADO);
        } else {
            ad.setStatus(StatusAluno.REPROVADO);
        }
        return ad.getStatus();
    }



}

