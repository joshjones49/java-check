package com.joshjones49.javacheck.dtos.clan;

import com.joshjones49.javacheck.entities.Player;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ClanResponseDto {

    private long id;
    private String name;
    private List<Player> members;
}
