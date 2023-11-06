package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Review;
import mapmovie.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController extends BaseController<Review, Integer> {

    @Autowired
    public ReviewController(ReviewService reviewService) {
        super(reviewService);
    }
}
