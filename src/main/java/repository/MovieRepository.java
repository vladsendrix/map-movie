package repository;

import domain.Movie;

import java.util.List;

public class MovieRepository implements Repository<Movie>{
    private List<Movie> movies;

    public MovieRepository(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void add(Movie object) {
        movies.add(object);
    }

    @Override
    public List<Movie> showAll() {
        return movies;
    }

    @Override
    public void delete(Movie object) {
        movies.remove(object);
    }

    @Override
    public void update(Movie object, Movie newObject) {
        object = newObject;
    }
}
