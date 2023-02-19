package DSA.Dsa_Topics.Array.Array_1D;

import java.util.Arrays;

/**
 * ? Algo:- Repeatedly Swap Two Adjacent Elements If They Are In Wrong Order
 * ! Time Complexity:- O(N^2).
 * * Space Complexity:- O(1).
 * # Stable:- Yes.
 */

public class T_04_Bubble_Sort {

    // Todo:- Method To Implement Bubble Sort.
    public static void Sort(int[] arr) {
        int n = arr.length;

        // * Outer Loop For No. Of Passes.
        for (int pass = 0; pass < n - 1; pass++) {
            boolean isSwapped = false;

            // * Inner Loop For Comparison & Swapping
            for (int idx = 0; idx < n - pass - 1; idx++) {

                // * Check For Wrong Order.
                if (arr[idx] > arr[idx + 1]) {
                    swap(arr, idx, idx + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break; // ! Array Is Sorted, No Need To Check Again.
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 2, 8, 0, 4 };
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
