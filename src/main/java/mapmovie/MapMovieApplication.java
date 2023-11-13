package mapmovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "mapmovie.model")
@ComponentScan(basePackages = "mapmovie.repository")
public class MapMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapMovieApplication.class, args);
	}

}
