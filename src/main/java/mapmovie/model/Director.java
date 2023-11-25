package mapmovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int directorID;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private char gender;

    public Director() {
    }

    public Director(int directorID, String firstName, String lastName, int yearOfBirth, char gender) {
        this.directorID = directorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getDirectorID() {
        return directorID;
    }

    public void setDirectorID(int directorID) {
        this.directorID = directorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Director{" +
            "directorID=" + directorID +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", yearOfBirth=" + yearOfBirth + '\'' +
            ", gender=" + gender + '\'' +
        '}';
    }
}