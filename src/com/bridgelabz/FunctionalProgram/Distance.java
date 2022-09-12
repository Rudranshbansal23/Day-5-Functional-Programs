package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
// the Euclidean distance is defined as the distance between two points
public class Distance {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y to calculate Euclidean distance : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		//here we are using math.pow to get the square of the number which user is going to input 
		final double p = 2;
		double x1 = Math.pow(x, p);
		double y1 = Math.pow(y, p);
		System.out.println("x1 and y1 are: " + x1 + " and " + y1);
		//adding the value of x1 and y1, and using math.sqrt to square-root the sum 
		double d = x1 + y1;
		double edistance = Math.sqrt(d);
		System.out.println("Eculidean distance is: " + edistance);

	}

}