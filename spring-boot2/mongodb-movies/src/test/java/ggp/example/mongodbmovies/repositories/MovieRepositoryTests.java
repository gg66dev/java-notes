package ggp.example.mongodbmovies.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import ggp.example.mongodbmovies.models.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Arrays;

@SpringBootTest
@DirtiesContext
public class MovieRepositoryTests {

    @Autowired
    MovieRepository userRepository;

    @Test
    public void contextLoads() {}

    @Test
    public void givenMovieObject_whenSave_thenCreateNewMovie() {
        Movie movie = new Movie();
        movie.setName("UP");
        movie.setDirector("Pete Docter");
        movie.setActors(Arrays.asList("Edward Asner", "Christopher Plummer", "Jordan Nagai"));
        movie.setYear(2009);
        userRepository.save(movie);
        assertThat(userRepository.findAll().size()).isGreaterThan(0);
    }

}
