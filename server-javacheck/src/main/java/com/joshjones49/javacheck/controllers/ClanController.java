package com.joshjones49.javacheck.controllers;

import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import com.joshjones49.javacheck.services.ClanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
