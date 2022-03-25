import java.io.*;
class GenericMethod
{
	static <T> void show(T element)
	{
		System.out.println(element.getClass().getName() +" = " + element);
	}
	public static void main(String[] args)
	{
		show(10);
		show("Darshana Bhave");
		show("Shivalika Srivastava");
		show("Mohini Bendale");
		show(20.5);
	}
}
