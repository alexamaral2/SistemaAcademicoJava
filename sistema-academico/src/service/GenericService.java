package service;

import repository.GenericRepository;
import entity.IdentificadorInterface;

import java.util.List;

public class GenericService<T extends IdentificadorInterface> {
    private final GenericRepository<T> repository;

    public GenericService(GenericRepository<T> repository) {
        this.repository = repository;
    }

    public void cadastrar(T obj) {
        repository.save(obj);
    }

    public List<T> listar() {
        return repository.findAll();
    }

    public T consultar(long id) {
        return repository.findById(id);
    }

    public void deletar(long id) {
        T obj = consultar(id);
        if (obj != null) {
            repository.delete(obj);
        }
    }
}
