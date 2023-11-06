package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.User;
import mapmovie.repository.UserRepository;

@Service
public class UserService extends BaseService<User, Integer> {

    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }

}
