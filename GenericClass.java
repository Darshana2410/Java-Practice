import java.io.*;


public class GenericClass <T1,T2>
{
	public void display(T1 var1, T2 var2)
	{
		System.out.println("Name: "+var1+"\nId: "+var2);
	}
	public static void main(String args[])
	{
		GenericClass<String,Integer> obj = new GenericClass<String,Integer> ();
		obj.display("Darshana",101);
	}
}