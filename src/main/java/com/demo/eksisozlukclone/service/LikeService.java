package com.demo.eksisozlukclone.service;

import com.demo.eksisozlukclone.repository.LikeRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class LikeService {
    private final LikeRepository likeRepository;
}
