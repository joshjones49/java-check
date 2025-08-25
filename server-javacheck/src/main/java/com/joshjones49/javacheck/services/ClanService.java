package com.joshjones49.javacheck.services;

import com.joshjones49.javacheck.dtos.clan.ClanRequestDto;
import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import com.joshjones49.javacheck.entities.Clan;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClanService {

    List<ClanResponseDto> getAllClans();

    ClanResponseDto createClan(ClanRequestDto clanRequestDto) throws BadRequestException;
}
