package com.study;
import java.util.*;

public class LongestSubstring {
	    public static int longestSubstring(String s){
	        int n = s.length();
	        int res = 0;

	        for (int i = 0; i < n; i++) {
	            boolean[] visited = new boolean[256];

	            for (int j = i; j < n; j++) {

	                if (visited[s.charAt(j)]) {
	                    break;
	                }
	                else {
	                    res = Math.max(res, j - i + 1);
	                    visited[s.charAt(j)] = true;
	                }
	            }
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String s=sc.nextLine();
	        System.out.println(longestSubstring(s));

	    }

	}
