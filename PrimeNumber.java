package com.study;
import java.util.*;

public class PrimeNumber {
	
//	method to check whether the no. is prime or not
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
	for(int i=2;i<=n/2;i++) {
		if(n%i == 0) {
			return false;
		}
	}
	return true;
}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enetr the number:");
	 int n=sc.nextInt();
	 
	 boolean isPrime = isPrime(n);
	 if(isPrime) {
		 System.out.println("The given number is a prime.");}
	 else {
		 System.out.println("The given number is not a prime.");
	 }
	 sc.close();
 }
}
