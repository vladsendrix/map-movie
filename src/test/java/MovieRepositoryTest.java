import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import domain.Movie;
import repository.MovieRepository;

public class MovieRepositoryTest {
    private MovieRepository movieRepository;

    @BeforeEach
    public void setUp() {
        List<Movie> movies = new ArrayList<>();
        movieRepository = new MovieRepository(movies);
    }

    @Test
    public void testAddMovie() {
        Movie testMovie = new Movie(1, "Test Movie", 2023, 101, 201, 120, 50000000);
        movieRepository.add(testMovie);

        Movie storedMovie = movieRepository.findByID(1);

        Assertions.assertNotNull(storedMovie);
        Assertions.assertEquals(testMovie, storedMovie);
    }
}
