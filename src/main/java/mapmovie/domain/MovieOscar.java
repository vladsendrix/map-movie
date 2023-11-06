package mapmovie.domain;

public class MovieOscar {
    private int movieID;
    private int oscarID;

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getOscarID() {
        return oscarID;
    }

    public void setOscarID(int oscarID) {
        this.oscarID = oscarID;
    }

    public MovieOscar(int movieID, int oscarID) {
        this.movieID = movieID;
        this.oscarID = oscarID;
    }
}
