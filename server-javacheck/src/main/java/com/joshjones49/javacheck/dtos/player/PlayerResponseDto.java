package com.joshjones49.javacheck.dtos.player;

import com.joshjones49.javacheck.entities.Clan;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlayerResponseDto {

    private String username;
    private List<Integer> scores;
    private Clan clan;
}
