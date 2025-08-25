package com.joshjones49.javacheck.controllers;

import com.joshjones49.javacheck.dtos.clan.ClanRequestDto;
import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.services.ClanService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequiredArgsConstructor
@RequestMapping("clan")
public class ClanController {

    private final ClanService clanService;

    @GetMapping
    public List<ClanResponseDto> getAllClans() {
        return clanService.getAllClans();
    }

    @PostMapping
    public ClanResponseDto createClan(@RequestBody ClanRequestDto clanRequestDto) throws BadRequestException {
        return clanService.createClan(clanRequestDto);
    }
}
