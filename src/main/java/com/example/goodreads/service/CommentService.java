package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Comment;
import com.example.goodreads.dao.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements CommentManager{
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment getCommentById(int id) {
        return commentRepository.findById(id).get();
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public boolean deleteCommentById(int id) {
        try{
            commentRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean deleteComment(Comment comment) {
        try{
            commentRepository.delete(comment);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}
