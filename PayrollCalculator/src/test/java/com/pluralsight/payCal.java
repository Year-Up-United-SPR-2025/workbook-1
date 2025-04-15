package com.pluralsight;
import java.util.Scanner;

public class payCal {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get the known values.
        String name = promptForName();
        float hoursWorked = promptForHoursWorked();
        double payRate = promptForPayRate();


        //Calculate the unknown
        double grossPay = calcGrossPay(hoursWorked, payRate);

        //Display the results
        System.out.printf("%s worked %f hours at a rate of %f and made %f", name, hoursWorked, payRate, grossPay);

    }

    /**
     * Calculates Gross Pay, considers overtime over 40 hours.
     * @param hoursWorked Number of hours worked in the pay week
     * @param payRate Amount paid per hour (base rate)
     * @return amount earned during pay period.
     */
    public static double calcGrossPay(float hoursWorked, double payRate){
//        if (hoursWorked <= 40){
//            return hoursWorked * payRate;
//        }
//        else{
//
//            float overtimeHours = hoursWorked - 40;
//            double basePay = 40 * payRate;
//            double overtimeRate = payRate * 1.5;
//            double overtimePay = overtimeHours * overtimeRate;
//
//            return basePay + overtimePay;
//        }

        return (hoursWorked > 40) ?  (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5) :  hoursWorked * payRate;

    }

    public static String promptForName(){
        System.out.print("Please enter the employee name: ");
        return scanner.nextLine();

    }

    public  static float promptForHoursWorked(){
        System.out.print("Please enter the number of hours worked this pay period: ");
        return  scanner.nextFloat();
    }

    public static double promptForPayRate(){

        System.out.print("Please enter the base pay rate: ");
        return scanner.nextDouble();
    }

}
