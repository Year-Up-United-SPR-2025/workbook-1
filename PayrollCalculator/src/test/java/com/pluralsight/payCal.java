package com.pluralsight;
import java.util.Scanner;

public class payCal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Name Scan
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Hours Worked Scan
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Pay Rate Scan
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        // Calculate Gross Pay Scan
        double grossPay = hoursWorked * payRate;

        // Display results Scan
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);

        scanner.close();
    }
}
