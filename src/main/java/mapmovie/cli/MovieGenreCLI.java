package mapmovie.cli;

import mapmovie.model.MovieGenre;
import mapmovie.repository.MovieGenreRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MovieGenreCLI {
    private final MovieGenreRepository movieGenreRepository;
    public MovieGenreCLI(MovieGenreRepository movieGenreRepository) {
        this.movieGenreRepository = movieGenreRepository;
    }

    @ShellMethod("Create a new MovieGenre.")
    public MovieGenre createMovieGenre(int genreID, int movieID){
        MovieGenre movieGenre = new MovieGenre();
        movieGenre.setMovieID(movieID);
        movieGenre.setGenreID(genreID);
        return movieGenreRepository.save(movieGenre);
    }

    @ShellMethod("Find a MovieGenre by ID.")
    public MovieGenre findMovieGenre(int id){
        return movieGenreRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a MovieGenre's details")
    public MovieGenre updateMovieOscar(int id, int movieID, int genreID){
        MovieGenre movieGenre = movieGenreRepository.findById(id).orElse(null);
        if(movieGenre != null){
            movieGenre.setMovieID(movieID);
            movieGenre.setGenreID(genreID);
            movieGenreRepository.save(movieGenre);
        }
        return movieGenre;
    }

    @ShellMethod("Delete a MovieGenre by ID")
    public void deleteMovieOscar(int id){
        movieGenreRepository.deleteById(id);
    }
}
