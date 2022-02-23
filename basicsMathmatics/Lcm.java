package org.practice.basicsMathmatics;

public class Lcm {
	//finding gcd 
	static int gcd (int a,int b) {
		if(b==0) {
			return a;
			
		}
		return gcd(b,a%b);
		
	}
	// we can calculate lcm to just appliying the multiplication of both the number and dividing the mutiplication result by gcd
	public static int  Lcm(int a,int b) {
		return a/gcd(a, b)*b;
		
	}
public static void main(String[] args) {
	int a=8; 
	int b=12;
	System.out.println(gcd(a,b));
	System.out.println(Lcm(a, b));
	}
}
