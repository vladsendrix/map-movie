package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Genre;
import mapmovie.repository.GenreRepository;

@Service
public class GenreService extends BaseService<Genre, Integer> {

    @Autowired
    public GenreService(GenreRepository repository) {
        super(repository);
    }

}
