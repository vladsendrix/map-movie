package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.ActorRole;
import mapmovie.repository.ActorRoleRepository;

@Service
public class ActorRoleService extends BaseService<ActorRole, Integer> {

    @Autowired
    public ActorRoleService(ActorRoleRepository repository) {
        super(repository);
    }

}
