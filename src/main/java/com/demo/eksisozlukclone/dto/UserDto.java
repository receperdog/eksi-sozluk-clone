package com.demo.eksisozlukclone.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @Email
    private String email;
}
