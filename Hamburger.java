package com.company;

import java.util.Scanner;

public class Hamburger {

    private String name="Basic Burger";
    private String breadType;
    private String meat;
    private double price=20;
    private int quantity = 0;


    public Hamburger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        this.addOns();
        priceOutput();
    }
    public void addOns () {
        int priceLettuce = 2;
        int priceCarrot = 2;
        int priceMayo = 1;
        int priceTomato = 3;

        System.out.println("Would you like some Lettuce for an additional charge?");
        Scanner readLettuce = new Scanner(System.in);
        String lettuceOption= readLettuce.nextLine().toLowerCase();
        if (lettuceOption.equals("yes")) {
            System.out.println("How much?");
            int lettuceQuantity= readLettuce.nextInt();
            int lettuceTotal = (priceLettuce * lettuceQuantity);
            this.quantity += lettuceQuantity;
            this.price += lettuceTotal;
            System.out.println("Your current total is " + this.price);
        }

        System.out.println("Would you like some Carrot for an additional charge?");
        Scanner readCarrot = new Scanner(System.in);
        String carrotOption= readCarrot.nextLine().toLowerCase();
        if (carrotOption.equals("yes")) {
            System.out.println("How much?");
            int carrotQuantity= readCarrot.nextInt();
            int carrotTotal = (priceCarrot * carrotQuantity);
            this.quantity += carrotQuantity;
            this.price += carrotTotal;
            System.out.println("Your current total is " + this.price);
        }

        System.out.println("Would you like some Mayo for an additional charge?");
        Scanner readMayo = new Scanner(System.in);
        String mayoOption= readMayo.nextLine().toLowerCase();
        if (mayoOption.equals("yes")) {
            System.out.println("How much?");
            int mayoQuantity= readMayo.nextInt();
            int mayoTotal = (priceMayo * mayoQuantity);
            this.quantity += mayoQuantity;
            this.price += mayoTotal;
            System.out.println("Your current total is " + this.price);
        }

        System.out.println("Would you like some Tomato for an additional charge?");
        Scanner readTomato = new Scanner(System.in);
        String tomatoOption= readTomato.nextLine().toLowerCase();
        if (tomatoOption.equals("yes")) {
            System.out.println("How much?");
            int tomatoQuantity= readLettuce.nextInt();
            int tomatoTotal = (priceTomato * tomatoQuantity);
            this.quantity += tomatoQuantity;
            this.price += tomatoTotal;
            System.out.println("Your current total is " + this.price);
        }

    }
    public void priceOutput () {
        System.out.println("Your total is: " + getPrice());

    }

    public String getName() {
        return name;
    }
    public String getBreadType() {
        return breadType;
    }
    public String getMeat() {
        return meat;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
