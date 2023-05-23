package com.demo.eksisozlukclone.repository;

import com.demo.eksisozlukclone.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
    Entry findByContent(String content);
    Entry findByContentIgnoreCase(String content);
    Entry findByDate(String date);
    Entry findByContentAndDate(String content,String date);
    Entry findByContentIgnoreCaseAndDate(String content,String date);
}
