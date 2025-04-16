package com.pluralsight;
import java.util.Scanner;

public class RentCarCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Create a Java application named RentalCarCalculator that estimates the cost of
//        reserving a rental car. Prompt the user for the following information:
//        - pickup date (store as a string)
//                - number of days for the rental
//        - whether they want an electronic toll tag at $3.95/day (yes/no)
//                - whether they want a GPS at $2.95/day (yes/no)
//                - whether they want roadside assistance at $3.95/day (yes/no)
//                - their current age
//
//        Calculate and display:
//        - basic car rental
//        - options cost
//                - underage driver surcharge
//        - total cost
//        The basic car rental is $29.99 per day. There is a 30% surcharge on the basic car
//        rental for drivers under 25. All taxes have already been incorporated into the
//        fees shown.

        //Number Rates
        double BaseRate = 29.99;
        double TollTag=3.95;
        double GPS = 2.95;
        double RoadAssist = 3.95;
        double BelowAgeSurcharge = 0.30;

        //date prompt 
        System.out.println("Pick a date: ");
        String pickupDate = scanner.nextLine();

        //day prompt 
        System.out.println("Number of Days: ");
        int days = scanner.nextInt();
        scanner.nextLine();
        
        //toll prompt 
        System.out.println("Need a Toll Tag (3.95/day) hit Y(es) or N(o): ");
        boolean toll = scanner.nextLine().equalsIgnoreCase("yes");
        scanner.nextLine();
        
        //gps prompt
        System.out.println("Need a GPS (2.95/day) hit Y(es) or N(o): ");
        boolean gps = scanner.nextLine().equalsIgnoreCase("yes");
        scanner.nextLine();
        
        //roadside assist prompt
        System.out.println("Need Roadside Assistance (3.95/day) hit Y(es) or N(o): ");
        boolean roadside = scanner.nextLine().equalsIgnoreCase("yes");
        scanner.nextLine();

        //age prompt
        System.out.println("What is your Age: ");
        scanner.nextLine();

        double totalCost = BaseRate * days;
        double choice = 0;

    }
}
