package repository;

import entity.IdentificadorInterface;

import java.util.List;

public interface GenericInterface<T extends IdentificadorInterface> {
    void save(T obj);

    List<T> findAll();

    void delete(T obj);

    T findById(long id);
}
