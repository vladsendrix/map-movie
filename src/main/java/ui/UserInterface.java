package ui;

import java.util.Scanner;
import controller.MovieController;
import domain.Movie;
import repository.MovieRepository;

public class UserInterface {
    private final MovieController movieController;
    private final Scanner scanner;

    public UserInterface(MovieController controller, MovieRepository repository) {
        this.movieController = new MovieController(repository);
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the Movie Management System");
        System.out.println("1. Add a Movie");
        System.out.println("2. View All Movies");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Movie newMovie = createMovie();
                    movieController.addMovie(newMovie);
                    System.out.println("Movie added successfully: " + newMovie.getTitle());
                    break;
                case 2:
                    System.out.println("Viewing all movies...");
                    for ( Movie movie : movieController.viewAllMovies()) {
                        System.out.println(movieController.movieDetails(movie));
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        System.out.println("Exiting the Movie Management System. Goodbye!");
        scanner.close();
    }

    private Movie createMovie() {
        System.out.println("Enter movie details:");
        int movieID = enterIntegerInput("Movie ID");
        String title = enterStringInput("Title");
        int year = enterIntegerInput("Year");
        int directorID = enterIntegerInput("Director ID");
        int studioID = enterIntegerInput("Studio ID");
        int runTimeMinutes = enterIntegerInput("Runtime (in minutes)");
        double budget = enterDoubleInput("Budget");

        return new Movie(movieID, title, directorID, studioID, runTimeMinutes, budget, year);
    }

    private int enterIntegerInput(String message) {
        System.out.print("Enter " + message + ": ");
        return scanner.nextInt();
    }

    private double enterDoubleInput(String message) {
        System.out.print("Enter " + message + ": ");
        return scanner.nextDouble();
    }

    private String enterStringInput(String message) {
        scanner.nextLine();
        System.out.print("Enter " + message + ": ");
        return scanner.nextLine();
    }

}
