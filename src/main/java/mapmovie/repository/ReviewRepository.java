package mapmovie.repository;

import org.springframework.stereotype.Repository;

import mapmovie.model.Review;

@Repository
public interface ReviewRepository extends BaseRepository<Review, Integer> {
}
