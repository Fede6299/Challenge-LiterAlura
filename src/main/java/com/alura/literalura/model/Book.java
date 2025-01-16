package com.alura.literalura.model;

import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String title;
    private List<Author> authors;
    private List<String> languages;
    private Integer download_count;

    public Book(DataBook dataBook) {
        this.title = dataBook.title();
        // Convertir DataAuthor a Author directamente (sin validaciones extras)
        this.authors = dataBook.authors() != null
                ? dataBook.authors().stream()
                .map(Author::new)
                .toList()
                : List.of(); // Lista vacía si no hay autores
        this.languages = dataBook.languages();
        this.download_count = dataBook.download_count();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> author) {
        this.authors = author;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Integer getDownload_count() {
        return download_count;
    }

    public void setDownload_count(Integer download_count) {
        this.download_count = download_count;
    }

    @Override
    public String toString() {
        String languagesString = String.join(", ", languages);
        String authorsString = authors.isEmpty()
                ? "Autor desconocido"
                : authors.stream()
                .map(Author::getName)
                .collect(Collectors.joining(", "));

        return String.format(
                """
                ----- LIBRO -----
                Titulo: %s
                Autor(es): %s
                Idiomas: %s
                Cantidad de descargas: %d
                -----------------
                """,
                title, authorsString, languagesString, download_count
        );
    }
}
