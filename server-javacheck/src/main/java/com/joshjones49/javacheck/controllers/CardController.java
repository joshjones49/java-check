package com.joshjones49.javacheck.controllers;

import com.joshjones49.javacheck.dtos.card.CardResponseDto;
import com.joshjones49.javacheck.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/search")
    public List<CardResponseDto> getUserSearchedCards(@RequestParam String searchTerm) {
        System.out.println("Received Search Term: "+ searchTerm);
        return cardService.getUserSearchedCards(searchTerm);
    }
}
