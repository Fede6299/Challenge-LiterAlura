package com.alura.literalura.main;

import com.alura.literalura.model.Data;
import com.alura.literalura.service.ApiConsumer;
import com.alura.literalura.service.JsonDataConverter;

import java.util.Scanner;

public class Main {
    private final ApiConsumer apiConsumer = new ApiConsumer();
    private final String URL_BASE = "https://gutendex.com/books/";
    private final JsonDataConverter jsonDataConverter = new JsonDataConverter();
    private final Scanner scanner = new Scanner(System.in);

    public void program(){
        boolean isRunning = true;
        while (isRunning){
            menu();
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> searchBookByTitle();
                case 2 -> listRegisteredBooks();
                case 3 -> listRegisteredAuthors();
                case 4 -> listLivingAuthorsByYear();
                case 5 -> listBooksByLanguage();

                case 0 -> {
                    isRunning = false;
                    System.out.println("Programa finalizado!");}

                default -> System.out.println("Opción Inválida");
            }
        }
    }

    public void menu (){
        System.out.println("""
                Elija la opción a través de un número:
                
                       ----------MENU----------
                1 - Buscar libro por titulo
                2 - Listar libros registrados
                3 - Listar autores registrados
                4 - Listar autores vivos en un determinado año
                5 - Listar libros por idioma

                0 - Salir
                       ----------MENU----------""");
    }

    public void searchBookByTitle() {
        System.out.println("Mostrando los libros...");
    }

    public void listRegisteredBooks() {
        System.out.println("Buscando libros registrados...");
    }

    private void listRegisteredAuthors() {
        System.out.println("Mostrando los autores registrados...");
    }

    private void listLivingAuthorsByYear() {
        System.out.println("Mostrando los autores vivos...");
    }

    private void listBooksByLanguage() {
        System.out.println("Mostrando los libros por idioma...");
    }
}
