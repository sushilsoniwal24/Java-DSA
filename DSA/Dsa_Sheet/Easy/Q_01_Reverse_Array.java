// Todo:- Reverse An Array.

package DSA.Dsa_Sheet.Easy;

import java.util.Arrays;

public class Q_01_Reverse_Array {

    // ? T.C = O(N) & S.C = O(1).
    public static void reverse(int[] arr) {
        int start_idx = 0, end_idx = arr.length - 1;
        while (start_idx < end_idx) {
            int temp = arr[start_idx];
            arr[start_idx] = arr[end_idx];
            arr[end_idx] = temp;
            start_idx++;
            end_idx--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
