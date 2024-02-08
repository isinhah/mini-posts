package com.dev.springmongodb.repository;

import com.dev.springmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

    //Query Methods
    List<Post> findByTitleContainingIgnoreCase(String text);
}
