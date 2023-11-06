package mapmovie.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import mapmovie.model.Movie;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Integer> {
    List<Movie> findByTitle(String title);
}
