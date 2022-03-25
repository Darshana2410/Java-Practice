import java.util.*;
public class ExArraySum
{
  public static void main(String args[])
  {
	int n,i;
	int sum=0;
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter size of array");
	n=sc.nextInt();
	int[] array = new int[n];
	System.out.println("Enter the elements of an array");
	for(i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		sum=sum+array[i];
	}
	System.out.println("Sum of Elements of array are :"+sum);
  }
}