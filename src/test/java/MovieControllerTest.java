import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import domain.Movie;
import repository.MovieRepository;
import controller.MovieController;

public class MovieControllerTest {

    private MovieController movieController;

    @BeforeEach
    public void setUp() {
        List<Movie> movies = new ArrayList<>();
        MovieRepository movieRepository = new MovieRepository(movies);
        movieController = new MovieController(movieRepository);
    }

    @Test
    public void testAddMovie() {
        Movie testMovie = new Movie(1, "Test Movie", 2023, 101, 201, 120, 50000000);
        movieController.addMovie(testMovie);

        List<Movie> storedMovies = movieController.getMovies();

        Assertions.assertNotNull(storedMovies);
        Assertions.assertEquals(1, storedMovies.size());
        Assertions.assertEquals(testMovie, storedMovies.get(0));
    }
}
