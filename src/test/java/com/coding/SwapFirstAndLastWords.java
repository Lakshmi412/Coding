package com.coding;

import java.util.Arrays;

public class SwapFirstAndLastWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Test Yantra";
		System.out.println("Given string: "+str);
		String[]s=str.split(" ");
		String temp="";
		
			temp=s[0];
			s[0]=s[s.length-1];
			s[s.length-1]=temp;
		
		System.out.println(temp);
		System.out.println(Arrays.toString(s));
		
	}

}
