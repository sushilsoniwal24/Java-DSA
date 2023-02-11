package Java_Language.Java_Topics;

import java.util.Scanner;

public class T_02_Input_Output {

    public static void main(String[] args) {

        // * Input In Java.
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        // * Output In Java.
        System.out.println("Your Age Is " + age);
        in.close();
    }
}
