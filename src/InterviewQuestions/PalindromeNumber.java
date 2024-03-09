package InterviewQuestions;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		
		int num = scan.nextInt();
		
		palindrome(num);
	}
	
	public static void palindrome(int num)
	{
		int digit,rev = 0;
		int temp = num;
		while(temp != 0)
		{
			digit = temp%10;
			rev = rev*10+digit;
			temp = temp/10;
		}
		temp = num;
		if(num == rev)
		{
			System.out.println(num +"    is a Palindrome Number ");
		}
		else 
		{
			System.out.println(num +"     is not a Palindrome Number ");
		}
	}

}
