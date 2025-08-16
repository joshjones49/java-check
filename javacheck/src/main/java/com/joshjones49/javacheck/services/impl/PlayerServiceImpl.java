package com.joshjones49.javacheck.services.impl;

import com.joshjones49.javacheck.dtos.player.PlayerRequestDto;
import com.joshjones49.javacheck.dtos.player.PlayerResponseDto;
import com.joshjones49.javacheck.entities.Player;
import com.joshjones49.javacheck.mappers.PlayerMapper;
import com.joshjones49.javacheck.repos.PlayerRepo;
import com.joshjones49.javacheck.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerMapper playerMapper;
    private final PlayerRepo playerRepo;

    @Override
    public PlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) throws BadRequestException {

        //make sure user has sent in proper request
        validateUserRequest(playerRequestDto);

        //turn the DTO into a User entity
        Player player = playerMapper.requestDtoToEntity(playerRequestDto);

        //save user to database
        playerRepo.save(player);

        return playerMapper.entityToDto(player);
    }

    @Override
    public List<PlayerResponseDto> getPlayers() {

        List<Player> playerList = playerRepo.findAll();

        return playerMapper.entitiesToDtos(playerList);
    }

    private void validateUserRequest(PlayerRequestDto playerRequestDto) throws BadRequestException {

        if(playerRequestDto == null) {
            throw new BadRequestException();
        }

        if(playerRequestDto.getUsername() == null || playerRequestDto.getPassword().isEmpty()) {
            throw new BadRequestException();
        }

        if(playerRequestDto.getPassword() == null || playerRequestDto.getPassword().isEmpty()) {
            throw new BadRequestException();
        }
    }
}
