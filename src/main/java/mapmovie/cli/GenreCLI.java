package mapmovie.cli;

import mapmovie.model.Genre;
import mapmovie.repository.GenreRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class GenreCLI {
    private final GenreRepository genreRepository;
    public GenreCLI(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    @ShellMethod("create a new genre.")
    public Genre createGenre(String name){
        Genre genre = new Genre();
        genre.setName(name);
        return genreRepository.save(genre);
    }

    @ShellMethod("Find a genre by ID.")
    public Genre findGenre(int id){
        return genreRepository.findById(id).orElse(null);
    }

    @ShellMethod("Update a genre's details")
    public Genre updateGenre(int id, String name){
        Genre genre = genreRepository.findById(id).orElse(null);
        if(genre != null){
            genre.setName(name);
            genreRepository.save(genre);
        }
        return genre;
    }

    @ShellMethod("Delete a genre by ID.")
    public void deleteGenre(int id){genreRepository.deleteById(id);}
}
