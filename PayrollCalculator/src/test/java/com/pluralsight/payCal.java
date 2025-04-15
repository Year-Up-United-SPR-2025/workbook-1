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
        float hoursWorked = scanner.nextFloat();

        // Pay Rate Scan
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();


        double grossPay;  //=hoursWorked * payRate;

        // Calculate Gross Pay Scan
        if (hoursWorked <= 40){
            grossPay = hoursWorked * payRate;
        }
        else {
            float overTimeHours = hoursWorked - 40;
            double basePay = 40 * payRate;
            double overtimeRate = payRate * 1.5;
            double overtimePay = overTimeHours * overtimeRate;

            grossPay = basePay + overtimePay;
        }

        // Display results Scan
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);

        scanner.close();
    }
}
