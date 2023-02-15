package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_01_Even_Odd {
    
    // * Method To Check Whether A Given Number Is Even Or Odd.
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter A Number, You Want To Check");
        int num = in.nextInt();

        if (isEven(num)) {
            System.out.println(num + " Is An Even Number");
        } else {
            System.out.println(num + "  Is An Odd Number");
        }

        in.close();
    }
}
