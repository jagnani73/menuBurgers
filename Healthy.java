package com.company;

import java.util.Scanner;

public class Healthy extends Hamburger {

    public double price;
    private String name;

    public Healthy(String meat) {
        super("Brown Rye Bread", meat);
        this.name = "Healthy Hamburger";
        super.addOns();
        this.price=super.getPrice() + 5;
        super.priceOutput();
    }

    public void addOns () {
        int priceCheese = 5;
        int  priceJalapeno = 5;

        System.out.println("Would you like some Cheese for an additional charge, provided only with this selection of our range?");
        Scanner readCheese = new Scanner(System.in);
        String cheeseOption= readCheese.nextLine().toLowerCase();
        if (cheeseOption.equals("yes")) {
            System.out.println("How much?");
            int cheeseQuantity= readCheese.nextInt();
            int cheeseTotal = (priceCheese * cheeseQuantity);
            this.price += cheeseTotal;
            System.out.println("Your current total is " + this.price);

        }
        System.out.println("Would you like some Jalapeno for an additional charge, provided only with this selection of our range?");
        Scanner readJalapeno = new Scanner(System.in);
        String jalapenoOption= readJalapeno.nextLine().toLowerCase();
        if (jalapenoOption.equals("yes")) {
            System.out.println("How much?");
            int jalapenoQuantity= readJalapeno.nextInt();
            int jalapenoTotal = (priceJalapeno * jalapenoQuantity);
            this.price += jalapenoTotal;
            System.out.println("Your current total is " + this.price);
        }
    }

}
