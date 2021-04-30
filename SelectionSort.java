package sortingAlgorithms;
import java.util.*;
public class SelectionSort
{
	public static void main(String[] args)
	{
		int i,j,n,min,temp;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		System.out.println("Sorted array is:");
		for(j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}	
}