package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Movie;
import mapmovie.repository.MovieRepository;

@Service
public class MovieService extends BaseService<Movie, Integer> {

    @Autowired
    public MovieService(MovieRepository repository) {
        super(repository);
    }

}
