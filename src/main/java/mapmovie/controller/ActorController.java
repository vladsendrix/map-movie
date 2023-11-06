package mapmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapmovie.model.Actor;
import mapmovie.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController extends BaseController<Actor, Integer> {

    @Autowired
    public ActorController(ActorService actorService) {
        super(actorService);
    }
}