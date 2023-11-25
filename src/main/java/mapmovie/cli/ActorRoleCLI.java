package mapmovie.cli;

import mapmovie.model.ActorRole;
import mapmovie.repository.ActorRoleRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ActorRoleCLI {
    private final ActorRoleRepository actorRoleRepository;

    public ActorRoleCLI(ActorRoleRepository actorRoleRepository){
        this.actorRoleRepository = actorRoleRepository;
    }
    @ShellMethod("Create new ActorRole.")
    public ActorRole createActorRole(int movieID, int actorID, String role){
        ActorRole actorRole = new ActorRole();
        actorRole.setActorID(actorID);
        actorRole.setMovieID(movieID);
        actorRole.setRole(role);
        return actorRoleRepository.save(actorRole);
    }

    @ShellMethod("Find an actorRole by ID.")
    public ActorRole findActorRole(int id){
        return actorRoleRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update an actorRole's details.")
    public ActorRole updateActorRole(int id, int actorID, int movieID, String role){
        ActorRole actorRole = actorRoleRepository.findById(id).orElse(null);
        if(actorRole != null){
            actorRole.setMovieID(movieID);
            actorRole.setActorID(actorID);
            actorRole.setRole(role);
            actorRoleRepository.save(actorRole);
        }
        return actorRole;
    }

    @ShellMethod("Delete an actorRole by ID.")
    public void deleteActorRole(int id){actorRoleRepository.deleteById(id);}
}
