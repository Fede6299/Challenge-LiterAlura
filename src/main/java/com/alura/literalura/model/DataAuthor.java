package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAuthor(
        String name,
        Integer birth_year,
        Integer death_year
) {
}
