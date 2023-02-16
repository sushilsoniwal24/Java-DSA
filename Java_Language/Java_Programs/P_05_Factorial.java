package Java_Language.Java_Programs;

public class P_05_Factorial {

    // Todo :- Factorial Of A Given Number.
    private static int printFacto(int num) {

        int ans = 1;
        while (num > 0) {
            ans *= num;
            num--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(printFacto(5));
    }
}
