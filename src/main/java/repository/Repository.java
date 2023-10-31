package repository;

import domain.Movie;

import java.util.List;

public interface Repository<T> {
    void add(T object);
    void delete(T object);
    void update(T object, T newObject);
    List<T> getAll();
    Movie findByID(int objectID);
}
