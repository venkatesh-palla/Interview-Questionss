package InterviewQuestions;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = new int[] {9,8,7,6,5,4,3,2,1};
        
        // Before sorting
        System.out.println("Array before sorting:");
        printArray(a);

        // Perform bubble sort
        bubble(a);

        // After sorting
        System.out.println("Array after sorting:");
        printArray(a);
    }

    public static void bubble(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    // Swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
