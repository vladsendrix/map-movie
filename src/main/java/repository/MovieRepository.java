package repository;

import domain.Movie;

import java.util.List;

public class MovieRepository implements Repository<Movie> {
    private List<Movie> movies;

    public MovieRepository(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void add(Movie movie) {
        movies.add(movie);
    }

    @Override
    public List<Movie> showAll() {
        return movies;
    }

    @Override
    public void delete(Movie movie) {
        movies.remove(movie);
    }

    @Override
    public void update(Movie movie, Movie newMovie) {
        movie = newMovie;
    }

    @Override
    public Movie findByID(int movieID) {
        for (Movie movie : movies) {
            if (movie.getMovieID() == movieID) {
                return movie;
            }
        }
        return null;
    }
}
