package InterviewQuestions;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		int a[] = new int[] {2,3,4,5,6,7,2,3,4,5};
		
		
		
		
		
		duplicate(a);
			
 	}
	public static void duplicate(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}


