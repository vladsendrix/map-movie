package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Review;
import mapmovie.repository.ReviewRepository;

@Service
public class ReviewService extends BaseService<Review, Integer> {

    @Autowired
    public ReviewService(ReviewRepository repository) {
        super(repository);
    }

}
