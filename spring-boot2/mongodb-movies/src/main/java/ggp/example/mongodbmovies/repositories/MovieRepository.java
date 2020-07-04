package ggp.example.mongodbmovies.repositories;

import ggp.example.mongodbmovies.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  MovieRepository extends MongoRepository<Movie, Long> {
}
