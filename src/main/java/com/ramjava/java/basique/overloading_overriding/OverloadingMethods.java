package com.ramjava.java.basique.overloading_overriding;

import java.util.Scanner;

public class OverloadingMethods {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter name of store or \"None\" if unknown:");
        String storeName = in.nextLine();
        double total = 0;
        total = getTotal();
        if (storeName.equalsIgnoreCase("None")) {
            print(total);
        } else {
            print(total, storeName);
        }
    }
    public static double getTotal() {
        double total = 0;
        Boolean moreItems = true;
        char response;
        while (moreItems) {
            total += getItemPrice(getItemName());
            System.out.println("More items? (y/n)");
            response = in.next().charAt(0);
            if (response != 'y' && response != 'Y')
                moreItems = false;
            in.nextLine();
        }
        return total;
    }
    public static String getItemName() {
        String name;
        System.out.println("Enter item name: ");
        name = in.nextLine();
        return name;
    }
    public static double getItemPrice(String value) {
        double price = 0;
        try {
            System.out.println("Enter price for " + value + ":");
            price = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid data type entered. ");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }
    public static int getItemQuantity() {
        System.out.println("Enter the quantity for this item: ");
        int quantity = in.nextInt();
        return quantity;
    }
    public static void print(double total) {
        System.out.printf("The total for your grocery items is: $%5.2f, " + " Thanks for buying with us!\n\n", total);
    }
    public static void print(double total, String storeName) {
        System.out.printf("The total for your grocery items is: $%5.2f, " + " Thanks for buying at %s!\n\n", total, storeName);
    }

}
