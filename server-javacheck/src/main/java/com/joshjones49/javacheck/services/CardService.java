package com.joshjones49.javacheck.services;

import com.joshjones49.javacheck.dtos.card.CardResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService {
    List<CardResponseDto> getCards();

    List<CardResponseDto> getRandomOrder();
}
