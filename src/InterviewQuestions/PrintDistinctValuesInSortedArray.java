package InterviewQuestions;
public class PrintDistinctValuesInSortedArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 2, 3, 4, 5, 5, 5};
        int count = 1;
        
        // Count adjacent duplicates
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }

        // Print distinct values
        for (int i = 0; i < a.length; i++) {
            // Check if current element is different from its preceding and succeeding elements
            if ((i==0 || a[i] != a[i - 1]) && (i == a.length - 1 || a[i] != a[i + 1])) {
                System.out.println(a[i]);
            }
        }
    }
}
