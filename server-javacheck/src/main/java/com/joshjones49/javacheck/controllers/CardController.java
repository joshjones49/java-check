package com.joshjones49.javacheck.controllers;

import com.joshjones49.javacheck.dtos.card.CardResponseDto;
import com.joshjones49.javacheck.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequiredArgsConstructor
@RequestMapping("cards")
public class CardController {

    private final CardService cardService;

    @GetMapping
    public List<CardResponseDto> getCards() {
        return cardService.getCards();
    }

    @GetMapping("/random")
    public List<CardResponseDto> getRandomOrder() {
        return cardService.getRandomOrder();
    }
}
