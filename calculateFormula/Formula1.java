package org.practice.calculateFormula;

public class Formula1 {
public static int holeSqare(int a , int b) {
	return a*a+b*b+(2*a*b);
}
public static void main(String[] args) {
	System.out.println("(a+b)^2 =" +holeSqare(25,25));
}
}
