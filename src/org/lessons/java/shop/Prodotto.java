package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;
    private Categoria categoria;
    //COSTRUTTORI

    public Prodotto(String name, String description, double price, double iva, Categoria categoria) throws Exception{
        if (name.isBlank()) {
            throw new Exception("Inserire un nome");
        }
        if (description.isBlank()) {
            throw new Exception("Inserire una descrizione");
        }
        if (price < 0) {
            throw new Exception("Prezzo non valido");
        }
        if (iva < 0) {
            throw new Exception("Iva non valida");
        }
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.categoria = categoria;
    }


    //GETTER E SETTER

    public int getCode() {
        return code;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    //METODI

    private int generateCode() {
        Random randomCode = new Random();
        return randomCode.nextInt(0,1001);
    }

    public double priceWithIva() {
            double totalPrice = price + iva;
            return totalPrice;
    }

    public String getFullName() throws Exception{
        if (name == null) {
            throw new Exception("Nome non valido");
        }
        return code + "-" + name;
    }

    @Override
    public String toString() {
        try {
            return getFullName() + " " + priceWithIva() + "$   Categoria: " + categoria.getName();

        }catch (Exception e) {
            return "errore";
        }

    }
}
