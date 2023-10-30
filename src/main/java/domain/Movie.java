package domain;

public class Movie {
    private int movieID;
    private String title;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;
    private int directorID;
    private int studioID;
    private int runTimeMinutes;
    private double budget;

    public Movie(int movieID, String title, int direcctorID, int studioID, int runTimeMinutes, double budget, int year) {
        this.movieID = movieID;
        this.title = title;
        this.directorID = direcctorID;
        this.studioID = studioID;
        this.runTimeMinutes = runTimeMinutes;
        this.budget = budget;
        this.year = year;
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

    public int getDirectorID() {
        return directorID;
    }

    public void setDirectorID(int direcctorID) {
        this.directorID = direcctorID;
    }

    public int getStudioID() {
        return studioID;
    }

    public void setStudioID(int studioID) {
        this.studioID = studioID;
    }

    public int getRunTimeMinutes() {
        return runTimeMinutes;
    }

    public void setRunTimeMinutes(int runTimeMinutes) {
        this.runTimeMinutes = runTimeMinutes;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
