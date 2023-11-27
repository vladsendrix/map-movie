package mapmovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class MovieGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieGenreID;

    private int genreID;
    private int movieID;

    public MovieGenre() {
    }

    public MovieGenre(int genreID, int movieID) {
        this.genreID = genreID;
        this.movieID = movieID;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getMovieGenreID() {
        return movieGenreID;
    }

    public void setMovieGenreID(int movieGenreID) {
        this.movieGenreID = movieGenreID;
    }
}