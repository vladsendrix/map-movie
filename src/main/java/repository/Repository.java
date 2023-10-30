package repository;

import java.util.List;

public interface Repository<T> {
    void add(T object);
    List<T> showAll();
    void delete(T object);
    void update(T object, T newObject);
    T findByID(int objectID);
}
