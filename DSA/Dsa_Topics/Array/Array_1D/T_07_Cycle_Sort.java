package DSA.Dsa_Topics.Array.Array_1D;

import java.util.Arrays;

/**
 * ? Cyclic_Sort:- Swap Element With His Correct Position.
 * ! Time Complexity:- O(N).
 * * Space Complexity :- O(1).
 * # Stable:- No.
 */

public class T_07_Cycle_Sort {

    // Todo:- Array Range = [0 - N] .
    public static void Sort1(int[] arr) {
        int n = arr.length;
        int idx = 0;

        while (idx < n) {
            int correct_idx = arr[idx];
            if (arr[idx] != arr[correct_idx]) {
                swap(arr, idx, correct_idx);
            } else {
                idx++;
            }
        }
    }

    // Todo:- Array Range = [1 - N] .
    public static void Sort2(int[] arr) {
        int n = arr.length;
        int idx = 0;

        while (idx < n) {
            int correct_idx = arr[idx]-1;
            if (arr[idx] != arr[correct_idx]) {
                swap(arr, idx, correct_idx);
            } else {
                idx++;
            }
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 2, 1, 0 };
        Sort1(arr1);

        System.out.println(Arrays.toString(arr1));
        int[] arr2 = { 4, 3, 2, 1, 5 };
        Sort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
