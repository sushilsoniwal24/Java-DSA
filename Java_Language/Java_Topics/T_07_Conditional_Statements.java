package Java_Language.Java_Topics;

import java.util.Scanner;

public class T_07_Conditional_Statements {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number :- ");
        int num = in.nextInt();

        if (num > 0) {
            System.out.println(num + " Is A Positive Number ");
        } else if (num < 0) {
            System.out.println(num + " Is A Negative Number ");
        } else {
            System.out.println("Zero");
        }

        in.close();
    }

}
