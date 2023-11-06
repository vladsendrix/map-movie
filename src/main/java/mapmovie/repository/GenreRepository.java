package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Genre;

@Repository
public interface GenreRepository extends BaseRepository<Genre, Integer> {
}
