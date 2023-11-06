package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Genre;
import mapmovie.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController extends BaseController<Genre, Integer> {

    @Autowired
    public GenreController(GenreService genreService) {
        super(genreService);
    }
}