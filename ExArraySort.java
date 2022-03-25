import java.util.*;
class ExArraySort
{
  public static void main(String args[])
  {
	int n,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of array : ");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements of array : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Sorted Array : ");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
  }
}