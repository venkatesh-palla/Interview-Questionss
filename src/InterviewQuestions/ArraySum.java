package InterviewQuestions;

public class ArraySum {

    public static void main(String[] args) {

        int a[] = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = sumOf(a);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int sumOf(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

