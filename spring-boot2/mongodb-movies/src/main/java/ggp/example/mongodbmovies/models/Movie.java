package ggp.example.mongodbmovies.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "movies")
public class Movie {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;

    String name;

    String director;

    List<String> actors;

    Integer year;

}
