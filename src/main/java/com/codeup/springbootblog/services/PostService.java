package com.codeup.springbootblog.services;



import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.List;

@Service //Spring Bean
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long id) {
        return posts.get((int)(id - 1)); //because the indices in our list are zero based
    }

    private void createPosts() {
        // create some ad objects and add them to the ads list
        // with the save method
        save(new Post("Title A", "Body A - Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis eaque incidunt molestiae, natus nisi optio possimus repellat voluptatibus. Harum id illum iste natus officiis quas ratione rem saepe, similique soluta."));
        save(new Post("Title B", "Body B - Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis eaque incidunt molestiae, natus nisi optio possimus repellat voluptatibus. Harum id illum iste natus officiis quas ratione rem saepe, similique soluta."));
        save(new Post("Title C", "Body C - Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis eaque incidunt molestiae, natus nisi optio possimus repellat voluptatibus. Harum id illum iste natus officiis quas ratione rem saepe, similique soluta."));
        save(new Post("Title D", "Body D - Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis eaque incidunt molestiae, natus nisi optio possimus repellat voluptatibus. Harum id illum iste natus officiis quas ratione rem saepe, similique soluta."));
        save(new Post("Title E", "Body E - Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis eaque incidunt molestiae, natus nisi optio possimus repellat voluptatibus. Harum id illum iste natus officiis quas ratione rem saepe, similique soluta."));

    }

}