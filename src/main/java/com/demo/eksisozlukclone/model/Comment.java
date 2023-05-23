package com.demo.eksisozlukclone.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;

    private String content;
    private String date;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "entryId")
    private Entry entry;
}
