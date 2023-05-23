package com.demo.eksisozlukclone.repository;

import com.demo.eksisozlukclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    Comment findByContent(String content);
    Comment findByContentIgnoreCase(String content);
    Comment findByDate(String date);
    Comment findByContentAndDate(String content,String date);
    Comment findByContentIgnoreCaseAndDate(String content,String date);
}
