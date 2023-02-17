package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_07_Palindrome_Number {

    // Todo:- Check Whether A Given Number Is Palindrome Or Not.
    public static boolean isPalindrome(int num) {
        int rev_num = reverse(num);
        return (rev_num == num);
    }

    // Todo:- Method To Reverse A Number.
    private static int reverse(int num) {
        int rev_Num = 0;
        while (num != 0) {
            int rem = num % 10;
            rev_Num = rev_Num * 10 + rem;
            num = num / 10;
        }
        return rev_Num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Number You Want To Check");
        int num = in.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " Is A Palindrome Number");
        } else {
            System.out.println(num + " Is Not A Palindrome Number");
        }

        in.close();
    }
}
