/*
 *			input => n1 = 12 ,n2 = 18
 *			
 *			output =.1,2,3,6
 * 
 * */

package InterviewQuestions;

import java.util.*;

public class FactorsOfATwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a first  number :");
		
		int n1 = scan.nextInt();
		
		System.out.println("Enter a second number :");
		
		int n2 = scan.nextInt();
		
		factor(n1, n2);
		
	}

		public static void factor(int n1,int n2)
		{
			for(int i=1;i<=n2;i++)
			{
				if(n1%i==0 && n2%i==0)
				{
					System.out.print(i+"  ");
				}
			}
		}
}
