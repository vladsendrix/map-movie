package mapmovie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieID;
    private String title;
    @Column(name = "releaseYear")
    private Integer year;
    private int directorID;

    public Movie() {
    }

    public Movie(String title, int year, int directorID) {
        this.title = title;
        this.year = year;
        this.directorID = directorID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDirectorID() {
        return directorID;
    }

    public void setDirectorID(int directorID) {
        this.directorID = directorID;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "movieID=" + movieID +
            "title='" + title + '\'' +
            ", year=" + year +
            ", directorID=" + directorID +
        '}';
    }
}