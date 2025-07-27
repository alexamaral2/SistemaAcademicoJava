package repository;

import entity.InterfaceIdentificador;

import java.util.List;

public interface GenericInterface<T extends InterfaceIdentificador> {
    void save(T obj);

    List<T> findAll();

    void delete(T obj);

    T findById(long id);
}
