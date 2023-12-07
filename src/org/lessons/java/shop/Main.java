package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //creiamo un array vuoto
        System.out.println("Quanti prodotti vuoi inserire? ");
        int size = Integer.parseInt(scanner.nextLine());

        Prodotto[] prodotti = new Prodotto[size];
        //inseriamo i prodotti
        for (int i = 0; i < prodotti.length; i++) {
            try {
                System.out.println("Prodotto " + (i + 1));
                System.out.println("Inserisci nome ");
                String name = scanner.nextLine();
                System.out.println("Inserisci descrizione ");
                String description = scanner.nextLine();
                System.out.println("Inserisci prezzo ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Inserisci iva ");
                double iva = Double.parseDouble(scanner.nextLine());
                System.out.println("Inserire il nome della categoria ");
                String namecategory = scanner.nextLine();
                System.out.println("Inserire la descrizione della categoria");
                String descriptionCategory = scanner.nextLine();
                //creo la categoria
                Categoria categoria = new Categoria(namecategory,descriptionCategory);
                //creo il prodotto
                Prodotto prodotto = new Prodotto(name,description,price,iva,categoria);
                //lo inserisco nell'array
                prodotti[i] = prodotto;

            } catch (Exception e) {
                System.out.println("Attenzione c'è un errore " + e.getMessage());
            }


        }
        //stampo i prodotti
        System.out.println("Elenco prodotti");
        for (int i = 0; i < prodotti.length; i++) {
            try {
                System.out.println(prodotti[i].toString());
            }catch (Exception e) {
                System.out.println("Errore");
            }
        }






        scanner.close();
    }
}
