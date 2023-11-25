package mapmovie.cli;

import mapmovie.model.Review;
import mapmovie.repository.ReviewRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ReviewCLI {
    private final ReviewRepository reviewRepository;
    public ReviewCLI(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @ShellMethod("Create a new review.")
    public Review createReview(int movieID, int userID, double rating, String comment){
        Review review = new Review();
        review.setComment(comment);
        review.setRating(rating);
        review.setMovieID(movieID);
        review.setUserID(userID);
        return reviewRepository.save(review);
    }

    @ShellMethod("Find a review by ID.")
    public Review findReview(int id){
        return reviewRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a review's details.")
    public Review updateReview(int id, int movieID, int userID, double rating, String comment){
        Review review = reviewRepository.findById(id).orElse(null);
        if(review != null){
            review.setComment(comment);
            review.setRating(rating);
            review.setMovieID(movieID);
            review.setUserID(userID);
            reviewRepository.save(review);
        }
        return review;
    }

    @ShellMethod("Delete a review by ID")
    public void deleteReview(int id){reviewRepository.deleteById(id);}
}
