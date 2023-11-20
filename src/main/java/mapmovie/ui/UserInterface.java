package mapmovie.ui;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserInterface {

    @ShellMethod("Say hello to the user.")
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
