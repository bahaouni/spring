package com.example.PostingAndD.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(PostDTO postDTO) {
        Post post = convertToPost(postDTO);
        return postRepository.save(post);
    }

    private Post convertToPost(PostDTO postDTO) {
        Post post = new Post();
        post.setName(postDTO.getName());
        post.setDescription(postDTO.getDescription());
        post.setPhoto(postDTO.getPhoto());
        post.setStartingPrice(postDTO.getStartingPrice());
        return post;
    }
}
