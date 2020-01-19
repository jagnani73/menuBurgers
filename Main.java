package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Bills Burger\nWould you like to have our Deluxe Burger, Healthy Burger, or our Basic Burger?");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine().toLowerCase();
        if (choice.equals("basic") || choice.equals("basic burger") || choice.equals("basic hamburger")) {
            System.out.println("With which meat?");
            String meatChoice = scan.nextLine();
            System.out.println("Bread type?");
            String breadChoice = scan.nextLine();
            Hamburger obj1 = new Hamburger(breadChoice, meatChoice);
            System.out.println("Your Basic Hamburger of price "+obj1.getPrice()+" with "+obj1.getQuantity()+" additional items is being prepared.");
            System.out.println("It has "+obj1.getBreadType()+" bread and "+obj1.getMeat()+"meat.");

        } else if (choice.equals("healthy")|| choice.equals("healthy burger") || choice.equals("healthy hamburger")) {
            System.out.println("With which meat?");
            String meatChoice = scan.nextLine();
            Healthy obj1 = new Healthy(meatChoice);
            System.out.println("Your Healthy Hamburger of price "+obj1.getPrice()+"with "+obj1.getQuantity()+"items is being prepared.");
            System.out.println("It has "+obj1.getBreadType()+" bread and "+obj1.getMeat()+" meat.");

        } else if (choice.equals("deluxe") || choice.equals("deluxe burger") || choice.equals("deluxe hamburger")) {
            System.out.println("With which meat?");
            String meatChoice = scan.nextLine();
            System.out.println("Bread type?");
            String breadChoice = scan.nextLine();
            Deluxe obj1 = new Deluxe(breadChoice, meatChoice);
            System.out.println("Your Deluxe Hamburger of price "+obj1.getPrice()+"with "+obj1.getQuantity()+"items is being prepared.");
            System.out.println("It has "+obj1.getBreadType()+" bread and "+obj1.getMeat()+"meat.");
        }
        System.out.println("THANK YOU!");
    }

}
