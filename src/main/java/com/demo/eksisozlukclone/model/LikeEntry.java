package com.demo.eksisozlukclone.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class LikeEntry  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likeId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "entryId")
    private Entry entry;
}
