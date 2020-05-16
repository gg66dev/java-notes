package hello.world;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import hello.world.model.Movie;

public class JPAHibernateCRUDTest extends JPAHibernateTest {


    @Test
    public void testGetObjectById_success() {
        Movie movie = em.find(Movie.class, 1);
        assertNotNull(movie);
    }

    @Test
    public void testGetAll_success() {
        List<Movie> books = em.createNamedQuery("Movie.getAll", Movie.class).getResultList();
        assertEquals(1, books.size());
    }

    @Test
    public void testPersist_success() {
        em.getTransaction().begin();
        em.persist(new Movie(2, "Space Jam", "Joe Pytka", 1996));
        em.getTransaction().commit();

        List<Movie> movies = em.createNamedQuery("Movie.getAll", Movie.class).getResultList();

        assertNotNull(movies);
        assertEquals(2, movies.size());
    }

    @Test
    public void testDelete_success(){
        Movie movie = em.find(Movie.class, 1);

        em.getTransaction().begin();
        em.remove(movie);
        em.getTransaction().commit();

        List<Movie> books = em.createNamedQuery("Movie.getAll", Movie.class).getResultList();

        assertEquals(0, books.size());
    }

}