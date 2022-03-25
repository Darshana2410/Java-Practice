// Java program to demonstrate the working of ArrayList in Java

import java.io.*;
import java.util.*;

class ExArrayList 
{
	public static void main(String[] args)
	{
		int n = 5;
		ArrayList<Integer> arrli= new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++)
			arrli.add(i);

		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		arrli.remove(4);

		// Displaying the ArrayList after deletion
		System.out.println(arrli);

		// Printing elements one by one using for loop
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
