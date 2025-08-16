package com.joshjones49.javacheck.mappers;

import com.joshjones49.javacheck.dtos.player.PlayerRequestDto;
import com.joshjones49.javacheck.dtos.player.PlayerResponseDto;
import com.joshjones49.javacheck.entities.Player;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerResponseDto entityToDto(Player player);

    Player requestDtoToEntity(PlayerRequestDto playerRequestDto);

    List<PlayerResponseDto> entitiesToDtos(List<Player> player);
}
