package com.demo.eksisozlukclone.repository;

import com.demo.eksisozlukclone.model.LikeEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntry, Long > {
}
