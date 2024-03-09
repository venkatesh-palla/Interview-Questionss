package InterviewQuestions;
import java.util.*;
public class OccuranceOfNumbers {
                                                  //In sorted order
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int num = scan.nextInt();
		
		int a[] = new int[num];
		
		System.out.print("Enter elements in Array :");
		
		for(int i=0;i<num;i++)
		{
			a[i] = scan.nextInt();
		}
		
		int count = 1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else 
			{
				System.out.println(a[i]+"=="+ count);
				count = 1;
			}
		}
		System.out.println(a[a.length-1]+"-"+count);
	}

}
