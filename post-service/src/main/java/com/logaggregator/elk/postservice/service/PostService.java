package com.logaggregator.elk.postservice.service;

import com.logaggregator.elk.postservice.domain.Post;
import com.logaggregator.elk.postservice.domain.PostWithComments;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getPosts();
    Optional<PostWithComments> getPost(Long id);
}
