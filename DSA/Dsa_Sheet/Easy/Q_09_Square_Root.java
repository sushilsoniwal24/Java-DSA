// Todo:- { Sqrt(x):-https://leetcode.com/problems/sqrtx/ }

package DSA.Dsa_Sheet.Easy;

public class Q_09_Square_Root {

    /**
     * ? Method-01:- Using Linear Search.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(1).
     */
    public static int mySqrt1(int x) {
        if (x < 2) {
            return x;
        }
        int i = 2;
        while (i <= x / 2) {
            if (i == x / i) {
                return i;
            }
            if (i > x / i) {
                break;
            }
            i++;
        }
        return i - 1;
    }
    // *-----------------------------------------------------------------

    /**
     * ? Method-02:- Using Binary Search.
     * * Time Complexity:- O(logn).
     * ! Space Complexity:- O(1).
     */
    public static int mySqrt2(int x) {
        if (x < 2) {
            return x;
        }
        int s = 2, e = x / 2;
        while (s <= e) {
            int m = s + (e - s) / 2;
            long square = (long) m * m;
            if (square == x) {
                return m;
            } else if (square > x) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt2(22));
    }
}
