package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Movie;
import mapmovie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController extends BaseController<Movie, Integer> {

    @Autowired
    public MovieController(MovieService movieService) {
        super(movieService);
    }
}