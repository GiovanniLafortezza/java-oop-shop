package org.lessons.java.shop;

public class Prodotto {
    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    //COSTRUTTORI

    public Prodotto(int code, String name, String description, double price, double iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
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


    //METODI

    public void price() {
         System.out.println("Il prezzo base del prodotto è di " + price + "$");
         System.out.println("Il prezzo totale compreso di iva è di " + priceWithIva() + "$");
    }

    private double priceWithIva() {
        double totalPrice = price + iva;
        return totalPrice;
    }
}
