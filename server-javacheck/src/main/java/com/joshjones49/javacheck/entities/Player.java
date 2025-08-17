package com.joshjones49.javacheck.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "clan_id", nullable = true)
    private Clan clan;

    @ElementCollection
    private List<Integer> scores = new ArrayList<>();
}
