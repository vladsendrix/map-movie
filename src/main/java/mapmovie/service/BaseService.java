package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService<T, ID> {
    private final JpaRepository<T, ID> repository;

    public BaseService(JpaRepository<T, ID> repository) {
        this.repository = (JpaRepository<T, ID>) repository;
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    public Iterable<T> findAll() {
        return repository.findAll();
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

}
