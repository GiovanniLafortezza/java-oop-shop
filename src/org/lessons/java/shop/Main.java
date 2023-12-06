package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random generateRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi inserire? ");
        int size = Integer.parseInt(scanner.nextLine());

        Prodotto[] prodotti = new Prodotto[size];

        for (int i = 0; i < prodotti.length; i++) {
            System.out.println("Prodotto " + (i + 1));
            System.out.println("Inserisci nome ");
            String name = scanner.nextLine();
            System.out.println("Inserisci descrizione ");
            String description = scanner.nextLine();
            System.out.println("Inserisci prezzo ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Inserisci iva ");
            double iva = Double.parseDouble(scanner.nextLine());
            int generateCode = generateRandom.nextInt(0, 1001);

            Prodotto prodotto = new Prodotto(generateCode,name,description,price,iva);
            prodotti[i] = prodotto;
        }

        System.out.println("Elenco prodotti");
        for (int i = 0; i < prodotti.length; i++) {

            System.out.println(prodotti[i].toString());
        }

        scanner.close();
    }
}
