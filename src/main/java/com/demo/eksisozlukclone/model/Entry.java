package com.demo.eksisozlukclone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long entryId;

    private String content;
    private String date;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "entry")
    private List<Comment> comments;

    @OneToMany(mappedBy = "entry")
    private List<LikeEntry> likes;
}
