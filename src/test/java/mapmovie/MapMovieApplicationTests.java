package mapmovie;

import mapmovie.model.Actor;
import mapmovie.service.ActorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@Transactional
class MapMovieApplicationTests {

    @Autowired
    private ActorService actorService;

    @Test
    void testSaveActor() {
        Actor actor = new Actor("John", "Doe", "American");

        Actor savedActor = actorService.save(actor);

        assertNotNull(savedActor.getActorID());
        assertEquals("John", savedActor.getFirstName());
        assertEquals("Doe", savedActor.getLastName());
        assertEquals("American", savedActor.getNationality());
    }

    @Test
    void testFindActorById() {
        Actor actor = new Actor("Jane", "Doe", "British");
        Actor savedActor = actorService.save(actor);

        Actor foundActor = actorService.findById(savedActor.getActorID());

        assertNotNull(foundActor);
        assertEquals(savedActor.getActorID(), foundActor.getActorID());
        assertEquals("Jane", foundActor.getFirstName());
        assertEquals("Doe", foundActor.getLastName());
        assertEquals("British", foundActor.getNationality());
    }

    @Test
    void testDeleteActorById() {
        Actor actor = new Actor("Tom", "Hanks", "American");
        Actor savedActor = actorService.save(actor);

        actorService.deleteById(savedActor.getActorID());

        Actor deletedActor = actorService.findById(savedActor.getActorID());
        assertNull(deletedActor);
    }

    @Test
    void testUpdateActor() {
        Actor actor = new Actor("Tom", "Hanks", "American");
        Actor savedActor = actorService.save(actor);

        savedActor.setFirstName("Tommy");
        savedActor.setLastName("Hank");
        savedActor.setNationality("British");
        Actor updatedActor = actorService.save(savedActor);

        assertNotNull(updatedActor);
        assertEquals(savedActor.getActorID(), updatedActor.getActorID());
        assertEquals("Tommy", updatedActor.getFirstName());
        assertEquals("Hank", updatedActor.getLastName());
        assertEquals("British", updatedActor.getNationality());
    }

}
