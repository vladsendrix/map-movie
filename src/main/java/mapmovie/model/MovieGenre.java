package mapmovie.model;

public class MovieGenre {
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

    public MovieGenre(int genreID, int movieID) {
        this.genreID = genreID;
        this.movieID = movieID;
    }
}
