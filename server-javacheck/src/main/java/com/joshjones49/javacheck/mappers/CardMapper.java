package com.joshjones49.javacheck.mappers;

import com.joshjones49.javacheck.dtos.card.CardRequestDto;
import com.joshjones49.javacheck.dtos.card.CardResponseDto;
import com.joshjones49.javacheck.entities.Card;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {

    //turn one entity into a dto
    CardResponseDto entityToDto(Card card);

    //turn request dto into entity
    Card requestDtoToEntity(CardRequestDto cardRequestDto);

    //turn list of entities to dtos
    List<CardResponseDto> entitiesToDtos(List<Card> card);
}
