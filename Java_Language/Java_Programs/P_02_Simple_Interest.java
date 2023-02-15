package Java_Language.Java_Programs;

import java.util.Scanner;

public class P_02_Simple_Interest {

    // Todo :- Method To Calculate Simple Interest.
    private static float calculate(float p, float r, float t) {
        float si = (p * t * r) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Principal Amount :- ");
        float p = in.nextInt();

        System.out.print("Enter The Time :- ");
        float t = in.nextInt();

        System.out.print("Enter The Rate Of Interest :- ");
        float r = in.nextInt();

        float ans = calculate(p, r, t);
        System.out.println("The Simple Interest Is :- " + ans);

        in.close();
    }
}
