package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort
{
		public static void main(String[] args)
		{
		int i,j,k,l,n,choice,temp;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int arr[]= new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Choose the order of Sorting:\n1 for ascending, and\n2 for descending.");
		choice=scan.nextInt();
		if(choice==1)
		{for(j=0;j<n;j++)
		{
			for(k=0;k<n-j-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		}
		if(choice==2)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n-j-1;k++)
				{
					if(arr[k]<arr[k+1])
					{
						temp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
					}
				}
			}
		}
		System.out.println("Your sorted array is:");
		for(l=0;l<n;l++)
		{
			System.out.print(arr[l]+"  ");
		}
	}
}