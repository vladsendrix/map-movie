package mapmovie.cli;

import mapmovie.model.Director;
import mapmovie.repository.DirectorRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DirectorCLI {
    private final DirectorRepository directorRepository;
    public DirectorCLI(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }

    @ShellMethod("Create a new director.")
    public Director createDirector(String firstName, String lastName, int yearOfBirth, char gender){
        Director director = new Director();
        director.setGender(gender);
        director.setFirstName(firstName);
        director.setLastName(lastName);
        director.setYearOfBirth(yearOfBirth);
        return directorRepository.save(director);
    }

    @ShellMethod("Find a director by ID.")
    public Director findDirector(int id){
        return directorRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a director's details.")
    public Director updateDirector(int id, String firstName, String lastName, int yearOfBirth, char gender){
        Director director = directorRepository.findById(id).orElse(null);
        if(director != null){
            director.setGender(gender);
            director.setFirstName(firstName);
            director.setLastName(lastName);
            director.setYearOfBirth(yearOfBirth);
            directorRepository.save(director);
        }
        return director;
    }

    @ShellMethod("Delete a director by ID.")
    public void deleteDirector(int id){directorRepository.deleteById(id);}
}
