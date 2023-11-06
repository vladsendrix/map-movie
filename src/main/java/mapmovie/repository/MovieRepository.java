package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Movie;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Integer> {
}
