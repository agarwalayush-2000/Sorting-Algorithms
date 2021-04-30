package sortingAlgorithms;
import java.util.*;
public class InsertionSort
{
	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}