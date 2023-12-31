package mapmovie.model;

import jakarta.persistence.Column;
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
    @Column(name = "awardYear")
    private Integer year;

    public Oscar() {
    }

    public Oscar(String category, int year) {
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

    public String toString() {
        return "Oscar{" +
            "oscarID=" + oscarID +
            ", category='" + category + '\'' +
            ", year=" + year +
        '}';
    }
}