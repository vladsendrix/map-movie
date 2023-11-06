package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Director;
import mapmovie.service.DirectorService;

@RestController
@RequestMapping("/director")
public class DirectorController extends BaseController<Director, Integer> {

    @Autowired
    public DirectorController(DirectorService directorService) {
        super(directorService);
    }
}