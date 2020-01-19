package com.company;

import java.util.Scanner;

public class Deluxe extends Hamburger {

    private double price;
    private String name;

    public Deluxe (String type, String meat) {
        super(type, meat);
        this.name = "Deluxe hamburger";
        super.addOns();
        this.price = super.getPrice() + 7;
        extras();
        super.priceOutput();

    }
    public void extras () {
        int priceExtra = 12;
        System.out.println("Would you like the combo for an additional charge, includes chips and coke, ?");
        Scanner readExtra = new Scanner(System.in);
        String extraOption= readExtra.nextLine().toLowerCase();
        if (extraOption.equals("yes")) {
            System.out.println("How much?");
            int extraQuantity = readExtra.nextInt();
            int extraTotal = (priceExtra * extraQuantity);
            this.price += extraTotal;
            System.out.println("Your current total is " + this.price);
        }
    }
}
