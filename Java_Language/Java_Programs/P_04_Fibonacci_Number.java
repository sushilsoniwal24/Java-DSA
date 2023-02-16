package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_04_Fibonacci_Number {

    // Todo:- Method To Get The N'th Fibonacci Number.
    private static int printFib(int n) {
        int first = 0, second = 1, next;

        if (n == 0) {
            return first;
        }

        else if (n == 1) {
            return second;
        }

        else {
            for (int i = 2; i < n; i++) {
                next = first + second;
                first = second;
                second = next;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Term You Want To Print In Fibonacci Series");
        int n = in.nextInt();

        System.out.println(printFib(n));
        in.close();
    }

}
