package InterviewQuestions;
import java.util.*;
public class FactorialCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		int fact = isFactorial(num);
		System.out.println("Factorial of " + num + " is " + fact);
	}
	
	public static int isFactorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
