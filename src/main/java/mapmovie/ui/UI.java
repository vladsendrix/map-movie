package mapmovie.ui;

import lombok.Getter;
import mapmovie.model.Actor;
import mapmovie.repository.ActorRepository;
import mapmovie.repository.BaseRepository;
import mapmovie.service.ActorService;
import mapmovie.service.BaseService;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Scanner;

public class UI {
    public Actor actor;
    @Getter
    public ActorService service;
    public ActorRepository rep;


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
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            mainMenu();
            int firstChoice = scanner1.nextInt();
            switch (firstChoice){

            }

        }
    }
}
