package com.study;
import java.util.*;
public class ExpandedCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String(eg:a1b2):");
		String s = sc.nextLine();
		
		int i=0,j=1;
		while(j<s.length()) {
			for(int k=0;k<s.charAt(j)-'0';k++) {
				System.out.print(s.charAt(i));
			}
			i+=2;
			j+=2;
		}
		sc.close();
	}

}
