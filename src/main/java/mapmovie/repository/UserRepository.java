package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.User;

@Repository
public interface UserRepository extends BaseRepository<User, Integer> {
}
