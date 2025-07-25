package repository;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T> {
    protected List<T> lista = new ArrayList<>();

    public void save(T obj) {
        lista.add(obj);
    }

    public List<T> findAll() {
        return lista;
    }

    public void delete(T obj) {
        lista.remove(obj);
    }
}
