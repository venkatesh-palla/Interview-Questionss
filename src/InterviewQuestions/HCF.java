package InterviewQuestions;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a First Number : ");
		
		int num1 = scan.nextInt();
		
		System.out.println("Enter a Second Number : ");
		
		int num2 = scan.nextInt();
		
		hcf(num1, num2);
	}
	
	public static void hcf(int num1,int num2)
	{
		int hcf = 1;
		for(int i=1;i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf = i;
				
			}
		}
		System.out.println(hcf);
	}

}
