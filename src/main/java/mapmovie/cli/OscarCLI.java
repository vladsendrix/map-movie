package mapmovie.cli;

import mapmovie.model.Oscar;
import mapmovie.repository.OscarRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class OscarCLI {
    private final OscarRepository oscarRepository;
    public OscarCLI(OscarRepository oscarRepository){
        this.oscarRepository = oscarRepository;
    }

    @ShellMethod("Create a new oscar.")
    public Oscar createOscar(String category, int year){
        Oscar oscar = new Oscar();
        oscar.setCategory(category);
        oscar.setYear(year);
        return oscarRepository.save(oscar);
    }

    @ShellMethod("Find an oscar by ID.")
    public Oscar findOscar(int id){
        return oscarRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update an oscar's details.")
    public Oscar updateOscar(int id, String category, int year){
        Oscar oscar = oscarRepository.findById(id).orElse(null);
        if(oscar != null){
            oscar.setCategory(category);
            oscar.setYear(year);
            oscarRepository.save(oscar);
        }
        return oscar;
    }

    @ShellMethod("Delete an oscar by ID.")
    public void deleteOscar(int id){
        oscarRepository.deleteById(id);
    }
}
