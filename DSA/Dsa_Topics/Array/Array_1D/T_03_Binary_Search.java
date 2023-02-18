package DSA.Dsa_Topics.Array.Array_1D;

// * Time Complexity = O(logn) & Space Complexity = O(1).

/**
 * (1) Start by checking the middle element of the list or array.
 * (2) If the middle element is equal to the target element, the search is
 * complete.
 * (3) If the target element is less than the middle element, repeat the search
 * process in the left half of the array.
 * (4) If the target element is greater than the middle element, repeat the
 * search process in the right half of the array.
 * (5) Repeat the process until the target element is found or it can be proven
 * that the element doesn't exist in the array.
 */

public class T_03_Binary_Search {

    // Todo:- Binary Search For Increasing Order Sorted Array.
    public static int searchINC(int[] arr, int target) {
        int n = arr.length;
        int start_idx = 0, end_idx = n - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            else if (arr[mid_idx] > target) {
                end_idx = mid_idx - 1;
            }

            else {
                start_idx = mid_idx + 1;
            }
        }

        return -1;
    }
    // *---------------------------------------------------------------------------------------------

    // Todo:- Binary Search For Decreasing Order Sorted Array.
    public static int searchDEC(int[] arr, int target) {
        int n = arr.length;
        int start_idx = 0, end_idx = n - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            else if (arr[mid_idx] > target) {
                start_idx = mid_idx + 1;
            }

            else {
                end_idx = mid_idx - 1;
            }
        }

        return -1;
    }
    // *---------------------------------------------------------------------------------------------

    // Todo:- Binary Search For Unknown Order Sorted Array.
    public static int OABS(int[] arr, int Target) {
        int n = arr.length;
        int start_idx = 0, end_idx = n - 1, mid_idx;

        while (start_idx <= end_idx) {
            mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == Target) {
                return mid_idx;
            }

            // Check If Array Is Sorted In Ascending Order.
            else if (arr[start_idx] < arr[end_idx]) {
                if (arr[mid_idx] > Target) {
                    end_idx = mid_idx - 1;
                } else {
                    start_idx = mid_idx + 1;
                }
            }

            // Check If Array Is Sorted In Decending Order.
            else {
                if (arr[mid_idx] > Target) {
                    start_idx = mid_idx + 1;
                } else {
                    end_idx = mid_idx - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 12, 19, 35 };
        System.out.println(OABS(arr, 19));
    }

}
