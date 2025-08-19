package com.joshjones49.javacheck.dtos.card;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardResponseDto {

    private Long id;

    private String question;

    private String answer;

    private String category;

    private boolean answerDisplayed;
}
