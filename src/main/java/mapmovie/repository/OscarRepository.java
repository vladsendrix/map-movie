package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Oscar;

@Repository
public interface OscarRepository extends BaseRepository<Oscar, Integer> {
}
