package com.logaggregator.elk.commentservice.service;

import com.logaggregator.elk.commentservice.domain.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsForPost(Long postId);
}
