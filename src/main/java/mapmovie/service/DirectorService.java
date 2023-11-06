package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Director;
import mapmovie.repository.DirectorRepository;

@Service
public class DirectorService extends BaseService<Director, Integer> {

    @Autowired
    public DirectorService(DirectorRepository repository) {
        super(repository);
    }

}
