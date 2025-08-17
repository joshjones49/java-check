package com.joshjones49.javacheck.dtos.card;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardRequestDto {

    private String question;

    private String answer;

    private String category;
}
