package InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digitCount = 0;

        int temp = num;

        // Count the number of digits in the input number
        while (temp != 0) {
            temp = temp / 10;
            digitCount++;
        }
        temp = num;

        // Calculate the sum of the power of each digit
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }

        // Check if the sum is equal to the original number to determine if it's an Armstrong number
        if (sum == num) {
            System.out.println(num+"  is a Amstrong Number");
        } else {
            System.out.println(num+"   is not a Amstrong Number");
        }
    }
}
