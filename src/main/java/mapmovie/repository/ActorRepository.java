package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Actor;

@Repository
public interface ActorRepository extends BaseRepository<Actor, Integer> {
    
}
