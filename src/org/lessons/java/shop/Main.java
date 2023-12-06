package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generateRandom = new Random();
        int generateCode = generateRandom.nextInt(0, 1001);
        Prodotto prodotto1 = new Prodotto(generateCode, "Cellulare", "Iphone 14", 560.99, 50.00);

    }
}
