//Write a function that takes in the radius as input and returns the circumference of a circle.

package com.exercise_1;

import java.util.*;

public class Fun_project_4{
	public static double radiusOfCircle(double c) {
		return 2 * 3.14 * c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double c = sc.nextDouble();
		
		double radius = radiusOfCircle(c);
		System.out.println(radius);
	}
}