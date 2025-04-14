package com.pluralsight;

public class MathApp {

    public static void main(String[] args){
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1:

        System.out.println("Determine whose salary is greater ");
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.printf("The greater value is " + highestSalary + " ");


        /// /////////////////////////////////////
        // Question 2: Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.

        double carPrice = 28590;
        double truckPrice = 150000;

        double vehiclePrice;

        vehiclePrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest value is: " + vehiclePrice);

        /// //////////////////////////////////
        // Question 3: Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle " + area);

        /// ///////////////////////////////////////
        // Question 4: Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);

        /// /////////////////////////////////
        // Question 5: Find and display the distance between the points (5, 10) and (85, 50)

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between the points: " + distance);

        /// /////////////////////////////
        // Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8
        double value = -3.8;

        double absoluteValue = Math.abs(value);

        System.out.println("Absolute value: " + absoluteValue);

        /// //////////////////////////////
        // Question 7: Find and display a random number between 0 and 1

        int num = 1;
        int num2 = 1;
        double randNum = Math.random();


        System.out.println("Random Number Between 0 and 1: " + randNum);

    }
}
