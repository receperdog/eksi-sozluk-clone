package com.demo.eksisozlukclone.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TopicDto {
    @NotEmpty
    private String title;
    @NotEmpty
    private String date;
    @NotNull
    private Long userId;

}
