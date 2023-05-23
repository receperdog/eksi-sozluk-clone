package com.demo.eksisozlukclone.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LikeDto {

    @NotNull
    @NotEmpty
    private Long userId;

    @NotNull
    @NotEmpty
    private Long entryId;
}
