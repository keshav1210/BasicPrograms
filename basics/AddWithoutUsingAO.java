package org.practice.basics;

public class AddWithoutUsingAO {
public static int add(int a,int b) {
	for(int i=1;i<=b;i++) {
		a++;
	}
	return a;
}
public static void main(String[] args) {
	
	System.out.println(add(5, 6));
}
}
