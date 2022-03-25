// Java Program to Demonstrate Implementation of LinekdList

import java.util.*;
public class ExLinkedList
{
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("Darsh");
		ll.add("Shiv");
		ll.addLast("Sanj");
		ll.addFirst("Nish");
		ll.add(2, "Tej");

		System.out.println(ll);

		ll.remove("Tej");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}