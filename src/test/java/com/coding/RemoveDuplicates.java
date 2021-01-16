package com.coding;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Test Yantra";
		System.out.println("Given string: "+str);
		String result= removeduplicates(str);
		System.out.println("Result: "+result);
	}
	public static String removeduplicates(String str)
	{
		String targetstr="";
		char[]arr=str.toCharArray();
		for(char value:arr)
		{
			if(targetstr.indexOf(value)==-1)
			{
				targetstr+=value;
			}
		}
		return targetstr;
	}

}
