package com.alura.literalura.main;

import com.alura.literalura.model.Data;
import com.alura.literalura.service.ApiConsumer;
import com.alura.literalura.service.JsonDataConverter;

public class Main {
    private final ApiConsumer apiConsumer = new ApiConsumer();
    private final String URL_BASE = "https://gutendex.com/books/";
    private final JsonDataConverter jsonDataConverter = new JsonDataConverter();

    public void menu(){
//        Datos generales de los libros
        var json = apiConsumer.getDataFromUrl(URL_BASE);
        System.out.println("Test data from API:");
        System.out.println(json);
//        Datos de los libros convertidos en Data.class
        var data = jsonDataConverter.convertJsonToClass(json, Data.class);
        System.out.println("Data converted to class for the first 5 books:");
        data.results().stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
