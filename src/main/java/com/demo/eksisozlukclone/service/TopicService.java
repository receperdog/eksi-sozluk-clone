package com.demo.eksisozlukclone.service;

import com.demo.eksisozlukclone.repository.TopicRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class TopicService {
    private final TopicRepository topicRepository;
}
