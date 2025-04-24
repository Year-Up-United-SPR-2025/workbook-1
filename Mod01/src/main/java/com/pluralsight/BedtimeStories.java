package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter one of the three names of the Books ypu want to read: " + "goldilocks.txt, hansel_and_gretel.txt or mary_had_a_little_lamb.txt\n");
        String fileName = inputScanner.nextLine();

        File storyFile = new File(fileName);

        try {
            Scanner fileScanner = new Scanner(storyFile);
            int lineNumber = 1;

            System.out.println("\nNow Reading: " + fileName + "\n");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.printf("%2d: %s%n", lineNumber, line);
                lineNumber++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please choose from one of the books provided" + "\n goldilocks.txt, hansel_and_gretel.txt or mary_had_a_little_lamb.txt\n");
        }

        inputScanner.close();
    }
}
