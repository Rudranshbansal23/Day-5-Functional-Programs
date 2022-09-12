package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // Scanner class Object for User Input
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Enter the value of c");
        int c = input.nextInt();
        // Calculating Delta Value
        int delta = b * b - 4 * a * c;
        // Calculating and Displaying Root1 & Root2 of X
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The real roots of quadratic equation are " + x1 + " and " + x2);
        } else
            System.out.println("The roots of quadratic equation are Imaginary.");
    }
}
