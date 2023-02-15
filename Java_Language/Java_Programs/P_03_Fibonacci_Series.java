package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_03_Fibonacci_Series {

    // Todo:- Print Fibonacci Series Till N'th Term.
    private static void printFib(int n) {
        int first = 0, second = 1, next;

        if (n == 0) {
            System.out.println(first + " ");
        }

        else {
            System.out.print(first + " " + second + " ");
            for (int i = 2; i < n; i++) {
                next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number Till You Want To Print Fibonacci Series");
        int n = in.nextInt();

        printFib(n);
        in.close();
    }
}
