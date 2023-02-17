package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_06_Reverse_Number {

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

        System.out.println("Enter The Number You Want To Reverse");
        int num = in.nextInt();
        int new_Num = reverse(num);
        System.out.printf("The Number %d After Reversing Is %d", num, new_Num);

        in.close();
    }
}
