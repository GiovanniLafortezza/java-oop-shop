package org.lessons.java.shop;

public class Categoria {
    //ATTRIBUTI
    private String name;
    private String description;

    //COSTRUTTORI
    public Categoria(String name, String description) throws Exception{
        if (name.isBlank()) {
            throw new Exception("Inserire una categoria");
        }
        if (description.isBlank()) {
            throw new Exception("Inserire una descrizione");
        }
        this.name = name;
        this.description = description;
    }

    //GETTER E SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
