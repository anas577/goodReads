package com.example.goodreads.web;


import com.example.goodreads.dao.entities.Comment;
import com.example.goodreads.service.CommentManager;
import com.example.goodreads.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentContoller {
    @Autowired
    private CommentManager commentService;

    @GetMapping
    public List<Comment> getComments() {
        return commentService.getAllComments();
    }

   @GetMapping
    public Comment updateComment( @RequestBody Comment comment) {
        return commentService.updateComment(comment);
    }

    @GetMapping
    public Comment addComment( @RequestBody Comment comment) {
        return commentService.addComment(comment);
    }
    @GetMapping("/{id}")
    public Comment getComment(@PathVariable int id) {
        return commentService.getCommentById(id);
    }

    @GetMapping("/{id}")
    public void deleteCommentById(@PathVariable int id) {
         commentService.deleteCommentById(id);
    }

}
