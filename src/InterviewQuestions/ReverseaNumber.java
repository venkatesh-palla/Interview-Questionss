package InterviewQuestions;

import java.util.Scanner;

public class ReverseaNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        
        int num = scan.nextInt();
        
        int reversedNum = reverse(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}
