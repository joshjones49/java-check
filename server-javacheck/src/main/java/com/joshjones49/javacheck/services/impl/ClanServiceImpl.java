package com.joshjones49.javacheck.services.impl;

import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.mappers.ClanMapper;
import com.joshjones49.javacheck.repos.ClanRepo;
import com.joshjones49.javacheck.services.ClanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClanServiceImpl implements ClanService {

    private final ClanRepo clanRepo;
    private final ClanMapper clanMapper;


    @Override
    public List<ClanResponseDto> getAllClans() {

        List<Clan> clanList = clanRepo.findAll();

        return clanMapper.entitiesToDtos(clanList);
    }
}
