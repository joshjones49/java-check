package com.joshjones49.javacheck.services;

import com.joshjones49.javacheck.dtos.clan.ClanResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClanService {

    List<ClanResponseDto> getAllClans();
}
