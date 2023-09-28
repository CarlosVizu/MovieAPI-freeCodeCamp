package dev.vizu.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //this is a DynamicQuery, that gets an unique variable in my Entity, and searchs the single object
    //in my database by this field.
    Optional<Movie> findByImdbId(String imdbId);
}
