package com.joshjones49.javacheck.repos;

import com.joshjones49.javacheck.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {

    @Query("SELECT c FROM Card c ORDER BY RANDOM()")
    List<Card> findAllInRandomOrder();

    @Query("SELECT c FROM Card c WHERE LOWER(c.question) LIKE LOWER(:searchTerm) OR LOWER(c" +
            ".answer) LIKE LOWER(:searchTerm)")
    List<Card> findAllBySearchedTerm(@Param("searchTerm") String searchTerm);
}
