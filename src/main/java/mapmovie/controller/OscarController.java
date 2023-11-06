package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Oscar;
import mapmovie.service.OscarService;

@RestController
@RequestMapping("/movies")
public class OscarController extends BaseController<Oscar, Integer> {

    @Autowired
    public OscarController(OscarService oscarService) {
        super(oscarService);
    }
}