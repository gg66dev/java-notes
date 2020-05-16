package hello.world.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = {
    @NamedQuery(name = "Movie.getAll", query = "SELECT m FROM Movie m")
})
public class Movie {

    @Id
    private Integer id;

    private String name;

    private String director;

    private Integer year;

    public Movie() {
    }

    public Movie(Integer id, String name, String director, Integer year) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", director='" + getDirector() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }

}