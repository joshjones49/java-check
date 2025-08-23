package com.joshjones49.javacheck.mappers;

import com.joshjones49.javacheck.dtos.clan.ClanRequestDto;
import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import com.joshjones49.javacheck.dtos.player.PlayerResponseDto;
import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.entities.Player;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClanMapper {

    List<ClanResponseDto> entitiesToDtos(List<Clan> clan);

    ClanResponseDto entityToDto(Clan clan);

    Clan requestDtoToEntity(ClanRequestDto clanRequestDto);
}
