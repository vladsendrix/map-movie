package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.User;
import mapmovie.service.UserService;

@RestController
@RequestMapping("/movies")
public class UserController extends BaseController<User, Integer> {

    @Autowired
    public UserController(UserService userService) {
        super(userService);
    }
}