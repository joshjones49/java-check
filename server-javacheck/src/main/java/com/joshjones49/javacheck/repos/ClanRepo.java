package com.joshjones49.javacheck.repos;

import com.joshjones49.javacheck.entities.Clan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClanRepo extends JpaRepository<Clan, Long> {
}
