package com.codeup.springbootblog.daos;

import com.codeup.springbootblog.models.Post;
import org.springframework.data.repository.CrudRepository;

// type of
public interface PostRepository extends CrudRepository<Post,Long> {
}
