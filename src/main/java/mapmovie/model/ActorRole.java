package mapmovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ActorRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorRoleID;
    private int movieID;
    private int actorID;
    private String role;

    public ActorRole() {
    }

    public ActorRole(int actorRoleID, int movieID, int actorID, String role) {
        this.actorRoleID = actorRoleID;
        this.movieID = movieID;
        this.actorID = actorID;
        this.role = role;
    }

    public int getActorRoleID() {
        return actorRoleID;
    }

    public void setActorRoleID(int actorRoleID) {
        this.actorRoleID = actorRoleID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String toString() {
        return "ActorRole{" +
                "actorRoleID=" + actorRoleID + '\'' +
                ", movieID=" + movieID + '\'' +
                ", actorID=" + actorID + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}