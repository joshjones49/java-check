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

            Player player3 = new Player();
            player3.setUsername("balgrufX");
            player3.setPassword("123");
            player3.getScores().add(87);
            player3.getScores().add(63);
            player3.getScores().add(65);
            player3.getScores().add(78);
            player3.getScores().add(73);
            playerRepo.saveAndFlush(player3);

            Player player5 = new Player();
            player5.setUsername("roll45");
            player5.setPassword("123");
            player5.getScores().add(58);
            player5.getScores().add(50);
            player5.getScores().add(73);
            player5.getScores().add(57);
            player5.getScores().add(90);
            playerRepo.saveAndFlush(player5);

            Player player4 = new Player();
            player4.setUsername("gripemieser");
            player4.setPassword("123");
            player4.getScores().add(80);
            player4.getScores().add(71);
            player4.getScores().add(68);
            player4.getScores().add(85);
            player4.getScores().add(72);
            playerRepo.saveAndFlush(player4);

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
