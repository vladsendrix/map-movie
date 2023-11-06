package mapmovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Oscar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oscarID;
    private String category;
    private int year;

    public Oscar() {
    }

    public Oscar(int oscarID, String category, int year) {
        this.oscarID = oscarID;
        this.category = category;
        this.year = year;
    }

    public int getOscarID() {
        return oscarID;
    }

    public void setOscarID(int oscarID) {
        this.oscarID = oscarID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}