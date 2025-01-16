package com.alura.literalura.model;

public class Author {
    private String name;
    private Integer birthYear;
    private Integer deathYear;

    public Author(DataAuthor dataAuthor) {
        this.name = dataAuthor.name();
        this.birthYear = dataAuthor.birth_year();
        this.deathYear = dataAuthor.death_year();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return  "Autor: " + name +
                "Fecha de nacimiento: " + birthYear +
                "Fecha de fallecimiento: " + deathYear;
    }
}
