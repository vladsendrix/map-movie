package mapmovie.cli;

import mapmovie.model.Actor;
import mapmovie.repository.ActorRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ActorCLI {

    private final ActorRepository actorRepository;

    public ActorCLI(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @ShellMethod("Create a new actor.")
    public Actor createActor(String firstName, String lastName, String nationality) {
        Actor actor = new Actor();
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        actor.setNationality(nationality);
        return actorRepository.save(actor);
    }

    @ShellMethod("Find an actor by ID.")
    public Actor findActor(int id) {
        return actorRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update an actor's details.")
    public Actor updateActor(int id, String firstName, String lastName, String nationality) {
        Actor actor = actorRepository.findById(id).orElse(null);
        if (actor != null) {
            actor.setFirstName(firstName);
            actor.setLastName(lastName);
            actor.setNationality(nationality);
            actorRepository.save(actor);
        }
        return actor;
    }

    @ShellMethod("Delete an actor by ID.")
    public void deleteActor(int id) {
        actorRepository.deleteById(id);
    }
}
