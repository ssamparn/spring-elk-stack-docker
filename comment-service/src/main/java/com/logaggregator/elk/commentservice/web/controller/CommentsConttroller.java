package com.logaggregator.elk.commentservice.web.controller;

import com.logaggregator.elk.commentservice.domain.Comment;
import com.logaggregator.elk.commentservice.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentsConttroller {

    private final CommentService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Comment>> getCommentsForPost(@RequestParam Long postId) {
        List<Comment> comments = service.getCommentsForPost(postId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
