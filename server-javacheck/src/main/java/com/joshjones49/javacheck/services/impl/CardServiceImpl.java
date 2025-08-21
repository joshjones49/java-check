package com.joshjones49.javacheck.services.impl;

import com.joshjones49.javacheck.dtos.card.CardResponseDto;
import com.joshjones49.javacheck.entities.Card;
import com.joshjones49.javacheck.mappers.CardMapper;
import com.joshjones49.javacheck.repos.CardRepo;
import com.joshjones49.javacheck.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepo cardRepo;
    private final CardMapper cardMapper;

    @Override
    public List<CardResponseDto> getCards() {

        List<Card> cardList = cardRepo.findAll();

        return cardMapper.entitiesToDtos(cardList);
    }

    @Override
    public List<CardResponseDto> getRandomOrder() {

        List<Card> randomList = cardRepo.findAllInRandomOrder();

        return cardMapper.entitiesToDtos(randomList);
    }
}
