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
        clan1.setName("Java Pros");
        clanRepo.saveAndFlush(clan1);
    }
}
