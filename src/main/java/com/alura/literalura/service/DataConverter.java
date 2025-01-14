package com.alura.literalura.service;

public interface DataConverter {
    <T> T convertJsonToClass(String json, Class<T> clazz);
}
