import controller.MovieController;
import repository.MovieRepository;
import ui.UserInterface;
import domain.Movie;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Inception", 2010, 101, 201, 148, 160000000));
        movies.add(new Movie(2, "The Shawshank Redemption", 1994, 102, 202, 142, 25000000));

        MovieRepository movieRepository = new MovieRepository(movies);
        MovieController movieController = new MovieController(movieRepository);
        UserInterface ui = new UserInterface(movieController, movieRepository);

        ui.run();
    }
}
