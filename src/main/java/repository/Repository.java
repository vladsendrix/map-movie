package repository;

import domain.Movie;

import java.util.List;

public interface Repository<T> {
    void add(T object);
    List<T> showAll();
    void delete(T object);
    void update(T object, T newObject);
    Movie findByID(int objectID);
}
