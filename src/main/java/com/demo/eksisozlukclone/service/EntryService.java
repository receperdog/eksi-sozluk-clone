package com.demo.eksisozlukclone.service;

import com.demo.eksisozlukclone.repository.EntryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class EntryService {
    private final EntryRepository entryRepository;
}
