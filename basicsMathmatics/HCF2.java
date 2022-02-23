package org.practice.basicsMathmatics;
// second way to find HCf
public class HCF2 {//class 
	// method to find gcd or hcf
	int gcd(int a, int b ) {
		// if b is zero then return a 
		if(b==0) {   
			return a;
		}
		//Recursive call of gcd method
		return gcd(b,(a%b));
	}
	
	
public static void main(String[] args) {
	//making object of hcf2 class 
	HCF2 h=new HCF2();
	// calling gcd method through hcf object and assign it to hcf variable
	int hcf=h.gcd(20, 14);
	
	System.out.println(hcf);
}
}
