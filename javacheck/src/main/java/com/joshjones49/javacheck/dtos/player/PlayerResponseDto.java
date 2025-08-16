package com.joshjones49.javacheck.dtos.player;

import com.joshjones49.javacheck.entities.Clan;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlayerResponseDto {

    private String username;
    private Clan clan;
}
