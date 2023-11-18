package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Actor;
import mapmovie.repository.ActorRepository;

@Service
public class ActorService extends BaseService<Actor, Integer> {
    @Autowired
    public ActorService(ActorRepository repository) {
        super(repository);
    }

}
