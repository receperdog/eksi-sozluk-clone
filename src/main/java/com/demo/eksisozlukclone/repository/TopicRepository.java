package com.demo.eksisozlukclone.repository;

import com.demo.eksisozlukclone.model.Topic;
import com.demo.eksisozlukclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    Topic findByTitle(String title);
    Topic findByTitleIgnoreCase(String title);
    Topic findByDate(String date);
    Topic findByTitleAndDate(String title,String date);
    Topic findByTitleIgnoreCaseAndDate(String title,String date);
    Topic findByUser(User user);

}
