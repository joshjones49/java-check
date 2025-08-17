package com.joshjones49.javacheck;

import com.joshjones49.javacheck.entities.Card;
import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.entities.Player;
import com.joshjones49.javacheck.repos.CardRepo;
import com.joshjones49.javacheck.repos.PlayerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Seeder implements CommandLineRunner {

    private CardRepo cardRepo;
    private PlayerRepo playerRepo;

    public Seeder(CardRepo cardRepo, PlayerRepo playerRepo){
        this.cardRepo = cardRepo;
        this.playerRepo = playerRepo;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Card card1 = new Card();
        card1.setQuestion("What are the 4 Pillars of OOP?");
        card1.setAnswer("Encapsulation, Inheritance, Abstraction, Polymorphism");
        card1.setCategory("OOP");
        cardRepo.saveAndFlush(card1);

//        Clan clan1 = new Clan();
//        clan1.setName("Java Pros");

        Player player1 = new Player();
        player1.setUsername("ultramax21");
        player1.setPassword("123");
//        player1.setClan(clan1);
        playerRepo.saveAndFlush(player1);

    }
}
