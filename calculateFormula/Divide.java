package org.practice.calculateFormula;
import java.math.BigInteger;
public class Divide {
	public int divide(String A) {
		int i=0;
		int j=1;
		
		BigInteger b=new BigInteger(A);
		BigInteger n=new BigInteger("30");
	//	BigInteger r=b.remainder(n);
		if(b.mod(n).equals(BigInteger.ZERO)) {
			return j;
		}
		return i;
	}
public static void main(String[] args) {
Divide d=new Divide();
System.out.println(d.divide("654564516456"));
}
}
