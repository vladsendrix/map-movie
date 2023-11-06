package mapmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapmovie.model.Oscar;
import mapmovie.repository.OscarRepository;

@Service
public class OscarService extends BaseService<Oscar, Integer> {

    @Autowired
    public OscarService(OscarRepository repository) {
        super(repository);
    }

}
