package domain;

public class Oscar {
    private int oscarID;
    private GenreTypes category;

    public Oscar(int oscarID, GenreTypes category) {
        this.oscarID = oscarID;
        this.category = category;
    }

    public int getOscarID() {
        return oscarID;
    }

    public void setOscarID(int oscarID) {
        this.oscarID = oscarID;
    }

    public GenreTypes getCategory() {
        return category;
    }

    public void setCategory(GenreTypes category) {
        this.category = category;
    }
}
