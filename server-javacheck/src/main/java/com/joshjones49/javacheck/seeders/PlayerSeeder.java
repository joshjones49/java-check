package com.joshjones49.javacheck.seeders;

import com.joshjones49.javacheck.entities.Player;
import com.joshjones49.javacheck.repos.PlayerRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PlayerSeeder {
    private final PlayerRepo playerRepo;

    public PlayerSeeder(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    @PostConstruct
    public void seed() {

        if(playerRepo.count() == 0) {

            Player player1 = new Player();
            player1.setUsername("ultramax21");
            player1.setPassword("123");
            player1.getScores().add(50);
            player1.getScores().add(60);
            player1.getScores().add(63);
            player1.getScores().add(55);
            player1.getScores().add(70);
            playerRepo.saveAndFlush(player1);

            Player player2 = new Player();
            player2.setUsername("madduck89");
            player2.setPassword("123");
            player2.getScores().add(75);
            player2.getScores().add(63);
            player2.getScores().add(60);
            player2.getScores().add(52);
            player2.getScores().add(70);
            playerRepo.saveAndFlush(player2);

//        Player player1 = new Player();
//        player1.setUsername("ultramax21");
//        player1.setPassword("123");
//        player1.getScores().add(50);
//        player1.getScores().add(60);
//        player1.getScores().add(63);
//        player1.getScores().add(55);
//        player1.getScores().add(70);
//        playerRepo.saveAndFlush(player1);
        }
    }
}
