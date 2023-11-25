package mapmovie.cli;

import mapmovie.model.Movie;
import mapmovie.repository.MovieRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MovieCLI {
    private final MovieRepository movieRepository;
    public MovieCLI(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @ShellMethod("Create a new movie.")
    public Movie createMovie(String title, int year, int directorID){
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setYear(year);
        movie.setDirectorID(directorID);
        return movieRepository.save(movie);
    }

    @ShellMethod("Find a movie by ID.")
    public Movie findMovie(int id){
        return movieRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a movie's details.")
    public Movie updateMovie(int id, String title, int year, int directorID){
        Movie movie = movieRepository.findById(id).orElse(null);
        if(movie != null){
            movie.setTitle(title);
            movie.setYear(year);
            movie.setDirectorID(directorID);
            movieRepository.save(movie);
        }
        return movie;
    }

    @ShellMethod("Delete a movie by ID.")
    public void deleteMovie(int id){movieRepository.deleteById(id);}

}
