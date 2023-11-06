package mapmovie.domain;

public class Genre {
    private int genreID;
    private GenreTypes genreName;

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public GenreTypes getGenreName() {
        return genreName;
    }

    public void setGenreName(GenreTypes genreName) {
        this.genreName = genreName;
    }

    public Genre(int genreID, GenreTypes genreName) {
        this.genreID = genreID;
        this.genreName = genreName;
    }
}
