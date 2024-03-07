package InterviewQuestions;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter a Number : ");
		 
		 int num = scan.nextInt();
		 
		 
		 
		 
//		 int sum = fibonaci(num);
		 
		 for(int i=1;i<=num;i++)
		 {
			 System.out.print(fibonaci(i)+" ");
		 }

		 
	}
	
	public static  int fibonaci(int num)
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			
		}
		return sum;
	}

}
