package org.practice.basicsMathmatics;

public class Hcf {
	//declaration of method with taking two parameters
	static int gcd(int a,int b) {
		//if a is zero then it will return b
		if(a==0) {
			return b;
			
		}
		//or if b is zero then it will return a
		if(b==0) {
			return a;
			
		}
		// if a and b both has same value then it will return a;
		if(a==b) {
			return a;
		}
		// if a is greater than b then will cakk recursive of gcd method 
		if(a>b) {
			return gcd(a-b,b);
		}
		// return recursive method of gcd
		return gcd(a,b-a);
	}
public static void main(String[] args) {
	int a=198;
	int b=56;
	System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
}
}
