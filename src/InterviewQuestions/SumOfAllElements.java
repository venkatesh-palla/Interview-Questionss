package InterviewQuestions;
import java.util.*;
public class SumOfAllElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the  Number :");
		
		int num = scan.nextInt();
		
		int a[] = new int[num];
		
		System.out.println("Enter the Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		
		
		
		
		sum(a);
	}
	
	
	public static void sum(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
	}

}
