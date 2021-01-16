package com.coding;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Test Yantra";
		System.out.println("Original string: "+str);
		String rev="";
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}
		System.out.println("Reversed String: "+rev);
	}

}
