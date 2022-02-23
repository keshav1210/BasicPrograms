//write a program to add two rational numbers
// addition of numbers c/a+d/b
package org.practice.basicsMathmatics;
// class
public class  AdditionOfRationalNumber {
	
	public static int gcd (int a,int b) {
		if (b==0){
		return a;	
	}
		return gcd(b,a%b);
	}
	public static int Lcm(int a, int b) {
		return a/gcd(a,b)*b;

	}
	public static void add(int a, int b ,int c,int d) {
		double val =(double
				)((Lcm(a, b)/a)*c+(Lcm(a, b)/b)*d)/Lcm(a, b);
		System.out.println(val);
	}

	public static void main(String[] args) {
		int a =9;
		int b=9;
		int c=1;
		int d=(-1);
		System.out.println(Lcm(a, b));
		//System.out.println(add(a, b, c, d)+" /"+Lcm(a, b));
		add(a, b, c, d);
		
	}
}
