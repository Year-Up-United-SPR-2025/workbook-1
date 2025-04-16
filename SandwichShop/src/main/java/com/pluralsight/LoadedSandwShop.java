package com.pluralsight;

import java.util.Scanner;

public class LoadedSandwShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //names for strings
        System.out.println("Choose Sandwich Size");
        System.out.println("1: Regular - $5.45");
        System.out.println("2: Large - $8.95");
        System.out.print("Enter 1 or 2: ");
        int sandwichChoice = scanner.nextInt();
        scanner.nextLine();

        double basePrice;
        if (sandwichChoice == 1){
            basePrice = 5.45;
        } else if (sandwichChoice == 2) {
            basePrice = 8.95;
        } else {
            scanner.close();
            return;
        }

        //prompt for loaded
        System.out.println("Do you want your sandwich loaded (y/n): ");
        String loadedResponse = scanner.nextLine().trim().toLowerCase();
        boolean Loaded = loadedResponse.equals("y");

        if (Loaded){
            if (sandwichChoice == 1){
                basePrice += 1.00;
            } else {
                basePrice += 1.75;
            }
        }

        //age prompt
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17){
            discount = 0.10; //for 10% discount
        } else if (age >= 65) {
            discount = 0.20; //discount for 20%
        }


        double finalPrice = basePrice * (1 - discount);
        System.out.printf("Your final price is: $%.2f%n", finalPrice);

        scanner.close();
    }
}
