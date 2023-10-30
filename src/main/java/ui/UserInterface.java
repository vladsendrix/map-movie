package ui;

import java.util.Scanner;
import controller.MovieController;

public class UserInterface {
    private final MovieController movieController;

    public UserInterface() {
        this.movieController = new MovieController();
    }

    public void displayMenu() {
        System.out.println("Welcome to the Movie Management System");
        System.out.println("1. Add a Movie");
        System.out.println("2. View All Movies");
        System.out.println("3. Search for a Movie");
        System.out.println("4. Sort by Title");
        System.out.println("5. Sort by Year");
        System.out.println("6. Sort by Rating");
        System.out.println("7. Sort by Genre");
        System.out.println("8. Sort by Director");
        System.out.println("9. Sort by Runtime");
        System.out.println("10. Sort by Language");
        System.out.println("11. Sort by Country");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Adding a movie...");
                    movieController.addMovie();
                    break;
                case 2:
                    System.out.println("Viewing all movies...");
                    movieController.viewAllMovies();
                    break;
                case 3:
                    System.out.println("Searching for a movie...");
                    movieController.searchMovie();
                    break;
                case 4:
                    System.out.println("Sorting by Title...");
                    movieController.sortByTitle();
                    break;
                case 5:
                    System.out.println("Sorting by Year...");
                    movieController.sortByYear();
                    break;
                case 6:
                    System.out.println("Sorting by Rating...");
                    movieController.sortByRating();
                    break;
                case 7:
                    System.out.println("Sorting by Genre...");
                    movieController.sortByGenre();
                    break;
                case 8:
                    System.out.println("Sorting by Director...");
                    movieController.sortByDirector();
                    break;
                case 9:
                    System.out.println("Sorting by Runtime...");
                    movieController.sortByRuntime();
                    break;
                case 10:
                    System.out.println("Sorting by Language...");
                    movieController.sortByLanguage();
                    break;
                case 11:
                    System.out.println("Sorting by Country...");
                    movieController.sortByCountry();
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

    public void printToScreen(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.run();
    }
}
