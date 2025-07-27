package repository;

import entity.InterfaceIdentificador;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T extends InterfaceIdentificador> implements GenericInterface<T> {
    private final List<T> lista = new ArrayList<>();
    private Long proximoId = 1L;

    @Override
    public void save(T obj) {
        if (obj.getId() == null) {
            obj.setId(proximoId);
            proximoId++;
        }
        lista.add(obj);
    }

    @Override
    public List<T> findAll() {
        return lista;
    }

    @Override
    public void delete(T obj) {
        lista.remove(obj);
    }

    @Override
    public T findById(long id) {
        for (T obj : lista) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }
}
