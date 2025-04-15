package com.pluralsight;
import java.util.Scanner;

public class baseCal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        int number1 = scanner.nextInt();
        System.out.println("What is the second number?");
        int number2 = scanner.nextInt();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        char option = scanner.next().charAt(0);

        if (option == 'M' || option == 'm') {
            int result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (option == 'A' || option == 'a' ) {
            int result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (option == 'S' || option == 's') {
            int result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (option == 'D' || option == 'd') {
            int result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
      scanner.close();

    }

}
