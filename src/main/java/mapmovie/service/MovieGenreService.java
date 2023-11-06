package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.MovieGenre;
import mapmovie.repository.MovieGenreRepository;

@Service
public class MovieGenreService extends BaseService<MovieGenre, Integer> {

    @Autowired
    public MovieGenreService(MovieGenreRepository repository) {
        super(repository);
    }

}
