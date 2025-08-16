package com.joshjones49.javacheck.repos;

import com.joshjones49.javacheck.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {
}
