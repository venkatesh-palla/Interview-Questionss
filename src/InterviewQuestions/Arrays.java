/* 

		input  =  [1,2,3]
		
		output = 1
				 1,2
				 1,2,3
				 2
				 2,3
				 3
 */






package InterviewQuestions;
import java.util.*;
public class Arrays {
	
	public static void subarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number of Elements : ");
		
		int num = scan.nextInt();
		
		int a[] = new int[num];
		
		System.out.println("Enter the elements : ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		subarray(a);
		
	}

}
