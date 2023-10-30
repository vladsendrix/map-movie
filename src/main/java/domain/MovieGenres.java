package domain;

public class MovieGenres {
    private int genreID;
    private int movieID;

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

    public MovieGenres(int genreID, int movieID) {
        this.genreID = genreID;
        this.movieID = movieID;
    }
}
