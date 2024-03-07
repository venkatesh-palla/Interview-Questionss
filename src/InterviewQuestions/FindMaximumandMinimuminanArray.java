package InterviewQuestions;

public class FindMaximumandMinimuminanArray {

	public static void main(String[] args) {

		int a[] = new int[] {66,33,88,33,3,90,57,1,55,99,53};
		
	    	int max = maxMin(a)[0];
	    	int min = maxMin(a)[1];
		
		  System.out.println("Maximum value: " + max);
	      System.out.println("Minimum value: " + min);
	}
	
	public static int[] maxMin(int a[])
	{
		int max = a[0];
		
		int min = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else if(a[i]<min)
			{
				min = a[i];
			}
		}
		return new int[] {min,max};
		
	}

}
