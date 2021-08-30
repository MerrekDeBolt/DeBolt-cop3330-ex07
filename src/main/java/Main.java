/*
 *  UCF COP3330 Fall 2021 Exercise 7 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    static double feetToMeters = 0.09290304;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        String lengthStr = scanner.nextLine();
        System.out.println("What is the width of the room in feet? ");
        String widthStr = scanner.nextLine();

        int length = Integer.parseInt(lengthStr);
        int width = Integer.parseInt(widthStr);

        int areaFeet = length * width;
        double areaMeters = areaFeet * feetToMeters;

        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}