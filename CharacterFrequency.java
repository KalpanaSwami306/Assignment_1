package com.study;
import java.util.*;
public class CharacterFrequency {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string(Eg:aabcccdeee):");
	 String s=sc.nextLine();
	 
//	 create a hashmap to char count:
	 Map<Character ,Integer>map=new HashMap<>();
	 
	 for(char ch:s.toCharArray()) {
		 map.put(ch, map.getOrDefault(ch, 0)+1);
	 }
	 for(Map.Entry<Character,Integer> entry: map.entrySet()) {
		 System.out.print(entry.getKey()+""+entry.getValue());
	 }
	 sc.close();
 }
}
