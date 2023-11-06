package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Director;

@Repository
public interface DirectorRepository extends BaseRepository<Director, Integer> {
}
