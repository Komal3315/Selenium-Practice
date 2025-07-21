package String;


import java.util.Iterator;

public class StringReverse {


	// Input - Komal Bhushan More 
	// Output - More Bhushan Komal
	public static void main(String[] args) 
	{
		String revString = reverseString("Komal Bhushan More");
		System.out.println(revString);
	}
	
	public static String reverseString(String name)
	{
		String revName ="";
		String[] str =name.split(" ");
		for(int i =str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		
		
		return revName;
	}
}
