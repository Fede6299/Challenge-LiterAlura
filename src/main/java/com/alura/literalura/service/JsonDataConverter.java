package com.alura.literalura.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataConverter implements DataConverter {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertJsonToClass(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}