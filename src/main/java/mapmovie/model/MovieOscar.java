package mapmovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class MovieOscar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieOscarID;
    private int oscarID;
    private int movieID;

    public MovieOscar() {
    }

    public MovieOscar(int movieOscarID, int oscarID, int movieID) {
        this.movieOscarID = movieOscarID;
        this.oscarID = oscarID;
        this.movieID = movieID;
    }

    public int getOscarID() {
        return oscarID;
    }

    public void setOscarID(int oscarID) {
        this.oscarID = oscarID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getMovieOscarID() {
        return movieOscarID;
    }

    public void setMovieOscarID(int movieOscarID) {
        this.movieOscarID = movieOscarID;
    }
}