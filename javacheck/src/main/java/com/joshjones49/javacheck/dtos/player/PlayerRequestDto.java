package com.joshjones49.javacheck.dtos.player;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlayerRequestDto {

    private String username;
    private String password;
}
