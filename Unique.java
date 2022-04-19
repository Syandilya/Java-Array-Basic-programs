import java.util.*;
class Unique 
{
	public static void main(String[] args) 
	{	Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		int i,j,p=0;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Unique elements in the array are : ");
		for(i=0;i<n;i++)
		{ p=0;
			for(j=0;j<n;j++)
		{
			if(a[i]==a[j])
				p++;
		}
			if(p==1)
				System.out.print(a[i]+" ");
			
		}
	}
}
