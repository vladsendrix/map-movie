package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.MovieGenre;

@Repository
public interface MovieGenreRepository extends BaseRepository<MovieGenre, Integer> {
}
