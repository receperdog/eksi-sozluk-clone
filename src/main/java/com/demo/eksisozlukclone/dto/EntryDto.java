package com.demo.eksisozlukclone.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntryDto {
    @NotNull
    @NotEmpty
    private String content;

    @NotNull
    @NotEmpty
    private String date;

    @NotNull
    @NotEmpty
    private Long userId;

    @NotNull
    @NotEmpty
    private Long topicId;


}
