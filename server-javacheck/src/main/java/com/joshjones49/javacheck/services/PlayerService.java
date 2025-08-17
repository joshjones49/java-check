package com.joshjones49.javacheck.services;

import com.joshjones49.javacheck.dtos.player.PlayerRequestDto;
import com.joshjones49.javacheck.dtos.player.PlayerResponseDto;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

    PlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) throws BadRequestException;

    List<PlayerResponseDto> getPlayers();
}
