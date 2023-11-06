package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.MovieOscar;
import mapmovie.repository.MovieOscarRepository;

@Service
public class MovieOscarService extends BaseService<MovieOscar, Integer> {

    @Autowired
    public MovieOscarService(MovieOscarRepository repository) {
        super(repository);
    }

}
