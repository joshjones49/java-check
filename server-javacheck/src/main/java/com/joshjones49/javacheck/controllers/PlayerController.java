package com.joshjones49.javacheck.controllers;

import com.joshjones49.javacheck.dtos.player.PlayerRequestDto;
import com.joshjones49.javacheck.dtos.player.PlayerResponseDto;
import com.joshjones49.javacheck.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequiredArgsConstructor
@RequestMapping("players")
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public PlayerResponseDto createPlayer(@RequestBody PlayerRequestDto playerRequestDto) throws BadRequestException {
        return playerService.createPlayer(playerRequestDto);
    }

    @GetMapping
    public List<PlayerResponseDto> getPlayers() {
        return playerService.getPlayers();
    }
}
