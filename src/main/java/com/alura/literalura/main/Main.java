package com.alura.literalura.main;

import com.alura.literalura.service.ApiConsumer;

public class Main {
    private final ApiConsumer apiConsumer = new ApiConsumer();
    private final String URL_BASE = "https://gutendex.com/books/?search=pride";

    public void menu(){
        var json = apiConsumer.getDataFromUrl(URL_BASE);
        System.out.println("Test data from API:");
        System.out.println(json);
    }
}
