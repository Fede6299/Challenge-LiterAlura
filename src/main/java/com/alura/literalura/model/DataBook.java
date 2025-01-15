package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBook(
        String title,
        List<DataAuthor> author,
        List<String> languages,
        Integer download_count
) {
}
