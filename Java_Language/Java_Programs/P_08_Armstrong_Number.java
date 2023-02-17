package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_08_Armstrong_Number {

    // Todo:- Method To Check Whether A Given Number Is Armstrong Or Not.
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int newNum = 0;
        while (num != 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            newNum = newNum + cube;
            num = num / 10;
        }
        return (originalNum == newNum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Number You Want To Check");
        int num = in.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " Is An Armstrong Number");
        } else {
            System.out.println(num + " Is Not An ArmstrongNumber");
        }

        in.close();
    }
}
