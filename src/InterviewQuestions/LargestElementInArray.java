package InterviewQuestions;
import java.util.*;
public class LargestElementInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number :");
		
		int num = scan.nextInt();
		
		int a[] = new int [num];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		
		
		
		largest(a);
	}
	
	public static void largest(int a[])
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println(max +"    is the largest number");
	}

}
