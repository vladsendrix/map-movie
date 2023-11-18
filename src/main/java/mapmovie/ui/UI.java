package mapmovie.ui;

import mapmovie.model.*;
import mapmovie.repository.ActorRepository;
import mapmovie.service.*;

import java.util.List;
import java.util.Scanner;

public class UI {
    public ActorService actorService;
    public ActorRoleService actorRoleService;
    public DirectorService directorService;
    public GenreService genreService;
    public MovieService movieService;
    public MovieGenreService movieGenreService;
    public MovieOscarService movieOscarService;
    public OscarService oscarService;
    public ReviewService reviewService;
    public UserService userService;
    public void mainMenu(){
        System.out.println("Welcome to the main menu - Select Action");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Show All");
    }

    public void entitiesMenu(){
        System.out.println("Select table for action: ");
        System.out.println("1. Actor");
        System.out.println("2. ActorRole");
        System.out.println("3. Director");
        System.out.println("4. Genre");
        System.out.println("5. GenreType");
        System.out.println("6. Movie");
        System.out.println("7. MovieOscar");
        System.out.println("8. Oscar");
        System.out.println("9. Review");
        System.out.println("10. User");
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            mainMenu();
            int firstChoice = scanner.nextInt();
            switch (firstChoice){
                case 1:
                    addMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    updateMenu();
                    break;
                case 4:
                    showAllMenu();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option");;
            }
        }
        System.out.println("Exiting menu!");
        scanner.close();
    }

    public void addMenu(){
        entitiesMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                addActor();
                break;
            case 2:
                addActorRole();
                break;
            case 3:
                addDirector();
                break;
            case 4:
                addGenre();
                break;
            case 5:
                break;
            case 6:
                addMovie();
                break;
            case 7:
                addMovieOscar();
                break;
            case 8:
                addOscar();
                break;
            case 9:
                addReview();
                break;
            case 10:
                addUser();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid value");
        }
    }
    
    public void addActor(){
        String firstName, lastName, nationality;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter nationality: ");
        nationality = scanner.nextLine();
        int id = 0;
        Actor actor = new Actor(id, firstName, lastName, nationality);
        actorService.save(actor);
    }

    public void addActorRole(){
        String role;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the role of the actor: ");
        role = scanner.nextLine();
        int actorRoleID = 0, movieID = 0, actorID = 0;
        ActorRole actorRole = new ActorRole(actorRoleID, movieID, actorID, role);
        actorRoleService.save(actorRole);
    }

    public void addDirector(){
        String firstName, lastName;
        int yearOfBirth, id = 0;
        char gender;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter year of birth: ");
        yearOfBirth = scanner.nextInt();
        System.out.println("Enter gender (M/F");
        gender = (char) scanner.nextShort();
        Director director = new Director(id, firstName, lastName, yearOfBirth, gender);
        directorService.save(director);
    }

    public void addGenre(){
        int id = 0;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter genre name: ");
        name = scanner.nextLine();
        Genre genre = new Genre(id, name);
        genreService.save(genre);
    }

    public void addMovie(){
        int id = 0, year, directorID = 0;
        String title;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        title = scanner.nextLine();
        System.out.println("Enter release year: ");
        year = scanner.nextInt();
        Movie movie = new Movie(id, title, year, directorID);
        movieService.save(movie);
    }

    public void addMovieGenre(){
        int genreID, movieID;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the movie: ");
        movieID = scanner.nextInt();
        System.out.println("Enter the ID of the genre: ");
        genreID = scanner.nextInt();
        MovieGenre movieGenre = new MovieGenre(genreID, movieID);
        movieGenreService.save(movieGenre);
    }

    public void addMovieOscar(){
        int movieID, oscarID;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the movie: ");
        movieID = scanner.nextInt();
        System.out.println("Enter the ID of the oscar: ");
        oscarID = scanner.nextInt();
        MovieOscar movieOscar = new MovieOscar(movieID, oscarID);
        movieOscarService.save(movieOscar);
    }

    public void addOscar(){
        int oscarID = 0, year;
        String category;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter category: ");
        category = scanner.nextLine();
        System.out.println("Enter release Year: ");
        year = scanner.nextInt();
        Oscar oscar = new Oscar(oscarID, category, year);
        oscarService.save(oscar);
    }

    public void addReview(){
        int reviewID = 0, movieID, userID;
        double rating;
        String comment;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the movie: ");
        movieID = scanner.nextInt();
        System.out.println("Enter the ID of the user: ");
        userID = scanner.nextInt();
        System.out.println("Enter rating: ");
        rating = scanner.nextInt();
        System.out.println("Enter comments: ");
        comment = scanner.nextLine();
        Review review = new Review(reviewID, movieID, userID, rating, comment);
        reviewService.save(review);
    }

    public void addUser(){
        int userID = 0;
        String username, firstname, lastname, email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter first name: ");
        firstname = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastname = scanner.nextLine();
        System.out.println("Enter email: ");
        email = scanner.nextLine();
        User user = new User(userID, username, firstname, lastname, email);
        userService.save(user);
    }
    public void  deleteMenu(){
        entitiesMenu();
        Scanner scanner = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Enter ID: ");
        int idName = str.nextInt();
        switch (choice){
            case 1:
                actorService.deleteById(idName);
                break;
            case 2:
                actorRoleService.deleteById(idName);
                break;
            case 3:
                directorService.deleteById(idName);
                break;
            case 4:
                genreService.deleteById(idName);
                break;
            case 5:
                break;
            case 6:
                movieService.deleteById(idName);
                break;
            case 7:
                movieOscarService.deleteById(idName);
                break;
            case 8:
                oscarService.deleteById(idName);
                break;
            case 9:
                reviewService.deleteById(idName);
                break;
            case 10:
                userService.deleteById(idName);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid value!");

        }

    }

    public void updateMenu(){}

    public void showAllMenu(){
        entitiesMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                List<Actor> actors = (List<Actor>) actorService.findAll();
                for(Actor actor: actors){
                    System.out.println(actor);
                }
                break;
            case 2:
                List<ActorRole> actorRoles = (List<ActorRole>) actorRoleService.findAll();
                for(ActorRole actorRole : actorRoles)
                    System.out.println(actorRole);
                break;
            case 3:
                List<Director> directors = (List<Director>) directorService.findAll();
                for(Director director : directors)
                    System.out.println(director);
                break;
            case 4:
                List<Genre> genres = (List<Genre>) genreService.findAll();
                for(Genre genre : genres)
                    System.out.println(genre);
                break;
            case 5:
                break;
            case 6:
                List<Movie> movies = (List<Movie>) movieService.findAll();
                for(Movie movie : movies)
                    System.out.println(movie);
                break;
            case 7:
                List<MovieOscar> movieOscars = (List<MovieOscar>) movieOscarService.findAll();
                for(MovieOscar movieOscar : movieOscars)
                    System.out.println(movieOscar);
                break;
            case 8:
                List<Oscar> oscars = (List<Oscar>) oscarService.findAll();
                for(Oscar oscar : oscars)
                    System.out.println(oscar);
                break;
            case 9:
                List<Review> reviews = (List<Review>) reviewService.findAll();
                for(Review review : reviews)
                    System.out.println(review);
                break;
            case 10:
                List<User> users = (List<User>) userService.findAll();
                for(User user : users)
                    System.out.println(user);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid value!");
        }
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();
    }
}
