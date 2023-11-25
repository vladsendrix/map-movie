package mapmovie.cli;

import mapmovie.model.User;
import mapmovie.repository.UserRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserCLI {
    private final UserRepository userRepository;
    public UserCLI(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @ShellMethod("Create a new user.")
    public User createUser(String username, String firstName, String lastName, String email){
        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        return userRepository.save(user);
    }

    @ShellMethod("Find an user by ID.")
    public User findUser(int id){return userRepository.findById(id).orElse(null);}

    @ShellMethod("Update an user's details.")
    public User updateUser(int id, String username, String firstName, String lastName, String email){
        User user = userRepository.findById(id).orElse(null);
        if(user != null){
            user.setEmail(email);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setUsername(username);
            userRepository.save(user);
        }
        return user;
    }

    @ShellMethod("Delete an user by ID.")
    public void deleteUser(int id){userRepository.deleteById(id);}
}
