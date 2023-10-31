package controller;

import domain.Movie;
import repository.MovieRepository;

import java.util.List;

public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie(Movie movie) {
        movieRepository.add(movie);
    }

    public List<Movie> getMovies() {
        return movieRepository.getAll();
    }

    public void searchMovie(int movieID) {
        Movie movie = movieRepository.findByID(movieID);
        if (movie != null) {
            System.out.println(movieDetails(movie));
        } else {
            System.out.println("Movie not found.");
        }
    }

    public String movieDetails(Movie movie) {
        return "Movie ID: " + movie.getMovieID() +
                ", Title: " + movie.getTitle() +
                ", Director ID: " + movie.getDirectorID() +
                ", Runtime: " + movie.getRunTimeMinutes() +
                ", Budget: " + movie.getBudget() +
                ", Year: " + movie.getYear();
    }
}
