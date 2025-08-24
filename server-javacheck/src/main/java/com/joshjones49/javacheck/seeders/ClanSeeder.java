package com.joshjones49.javacheck.seeders;

import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.repos.ClanRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ClanSeeder {

    private final ClanRepo clanRepo;

    public ClanSeeder(ClanRepo clanRepo) {
        this.clanRepo = clanRepo;
    }

    @PostConstruct
    public void seed() {

        Clan clan1 = new Clan();
        clan1.setName("That's So Maven");
        clanRepo.saveAndFlush(clan1);

        Clan clan2 = new Clan();
        clan2.setName("Java Beans");
        clanRepo.saveAndFlush(clan2);

        Clan clan3 = new Clan();
        clan3.setName("Spring-Booters");
        clanRepo.saveAndFlush(clan3);
    }
}
