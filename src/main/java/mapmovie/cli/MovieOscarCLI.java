package mapmovie.cli;

import mapmovie.model.MovieOscar;
import mapmovie.repository.MovieOscarRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MovieOscarCLI {
    private final MovieOscarRepository movieOscarRepository;
    public MovieOscarCLI(MovieOscarRepository movieOscarRepository){
        this.movieOscarRepository = movieOscarRepository;
    }

    @ShellMethod("Create a new MovieOscar.")
    public MovieOscar createMovieOscar(int oscarID, int movieID){
        MovieOscar movieOscar = new MovieOscar();
        movieOscar.setMovieID(movieID);
        movieOscar.setOscarID(oscarID);
        return movieOscarRepository.save(movieOscar);
    }

    @ShellMethod("Find a MovieOscar by ID.")
    public MovieOscar findMovieOscar(int id){
        return movieOscarRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a MovieOscar's details")
    public MovieOscar updateMovieOscar(int id, int movieID, int oscarID){
        MovieOscar movieOscar = movieOscarRepository.findById(id).orElse(null);
        if(movieOscar != null){
            movieOscar.setMovieID(movieID);
            movieOscar.setOscarID(oscarID);
            movieOscarRepository.save(movieOscar);
        }
        return movieOscar;
    }

    @ShellMethod("Delete a MovieOscar by ID")
    public void deleteMovieOscar(int id){
        movieOscarRepository.deleteById(id);
    }
}
