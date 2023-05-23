package com.demo.eksisozlukclone.service;

import com.demo.eksisozlukclone.repository.CommentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
}
