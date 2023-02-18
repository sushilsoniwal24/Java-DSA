package DSA.Dsa_Topics.Array.Array_1D;

// Todo:- Linear Search=> Compare Every Element With The Target Element.

public class T_02_Linear_Search {

    // * Time Complexity = O(n) & Space Complexity = O(1).
    public static int search(int[] arr, int Target) {
        int arr_len = arr.length;

        for (int idx = 0; idx < arr_len; idx++) {
            if (arr[idx] == Target) {
                return idx;
            }
        }
        return -1; // Target Not Found.
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 5, 3, 90, 30 };
        System.out.println(search(arr, 90));
    }
}
