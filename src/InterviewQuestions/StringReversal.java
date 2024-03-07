package InterviewQuestions;
import java.util.*;
public class StringReversal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String str = scan.nextLine();
		
		String rev = reverse(str);
		
		System.out.println();
		
		
		

	}
	public static String reverse(String str)
	{
		String rev = "";
		for(int i=0;i<str.length();i++)
		{
			rev = rev+str.charAt(i);
		}
		return rev;
	}

}
