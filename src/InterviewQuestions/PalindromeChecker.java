package InterviewQuestions;
import java.util.*;
public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String str = scan.nextLine();
		
		String rev = "";
		
		String str1 = str;
		
		for(int i=0;i<str1.length();i++)
		{
			rev = rev+str1.charAt(i);
		}
		
		if(rev.equals(str1))
		{
			System.out.println(str+"  is a Palindrome.");
		}
		
		else 
		{
			System.out.println(str+"  is not a Palindrome.");
		}
	}

}


//              {method 2}


//package InterviewQuestions;
//import java.util.*;
//public class PalindromeChecker {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a String :");
//		
//		String str = scan.nextLine();
//		
//		if (isPalindrome(str)) {
//            System.out.println(str + " is a Palindrome.");
//        } else {
//            System.out.println(str + " is not a Palindrome.");
//        }
//	
//}	
//
//	public static boolean isPalindrome(String str){
//		
//		
//	int i = 0;
//	int j = str.length()-1;
//	
//	while(i<j)
//	{
//		if(str.charAt(i) != str.charAt(j))
//		{
//			return false;
//		}
//		i++;
//		j--;
//	}
//	
//	return true;
//	}
//}	



