package InterviewQuestions;
import java.util.*;
public class FactorsOfaNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int num = scan.nextInt();
		
		factor(num);

	}
	
	public static void  factor(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
