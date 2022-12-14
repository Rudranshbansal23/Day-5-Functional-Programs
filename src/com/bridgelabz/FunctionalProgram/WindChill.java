package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// Scanner class Object for User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of temperature in Fahrenheit:");
		double t = sc.nextDouble();
		System.out.println("Enter the value of wind speed in miles per hour");
		double v = sc.nextDouble();
		  //Formula is valid for these conditions only
		if (t < 50 && v > 3 && v < 120) {
			//Formula to get Wind Chill Temperature40
			double windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
			System.out.println("Wind chill factor is:" + windchill);
		} else
			System.out.println("Out of range values!");
	}
}