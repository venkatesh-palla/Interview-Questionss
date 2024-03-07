package InterviewQuestions;
import java.util.*;
public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int num = scan.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+"  is a Prime Number");
		}
		else
		{
			System.out.println(num+"  is not a Prime Number");
		}
	}
	
	public static boolean isPrime(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
