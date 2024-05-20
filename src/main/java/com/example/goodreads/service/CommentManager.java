package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Comment;

import java.util.List;

public interface CommentManager {
    public Comment addComment(Comment comment);
    public Comment getCommentById(int id);
    public Comment updateComment(Comment comment);
    public boolean deleteCommentById(int id);
    public boolean deleteComment(Comment comment);
    public List<Comment> getAllComments();
}
