package service;

import entity.PeriodoLetivo;
import repository.PeriodoLetivoRepository;

public class PeriodoLetivoService extends GenericService<PeriodoLetivo> {
    public PeriodoLetivoService(PeriodoLetivoRepository repository) {
        super(repository);
    }
}
