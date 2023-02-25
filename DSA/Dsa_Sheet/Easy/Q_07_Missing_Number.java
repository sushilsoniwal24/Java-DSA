// Todo:- (Missing Number:- https://leetcode.com/problems/missing-number/description/)

package DSA.Dsa_Sheet.Easy;

import java.util.Arrays;

public class Q_07_Missing_Number {

    /**
     * ? Method-01:- Using Two For Loops.
     * * Time Complexity:- O(n^2).
     * ! Space Complexity:- O(1).
     */
    public static int missingNumber1(int[] nums) {
        int n = nums.length;

        // * Iterating over the array and checking if the number is present in array.
        for (int i = 0; i < n; i++) {
            boolean isPresent = false;
            for (int j = 0; j < n; j++) {
                // * If the number is present, we continue. */
                if (i == nums[j]) {
                    isPresent = true;
                    break;
                }
            }
            // * If the number is not present, we return it.
            if (!isPresent)
                return i;
        }
        return n;
    }
    // *--------------------------------------------------------------------------------------

    /**
     * ? Method-02:- Using An Extra Array & Sorting.
     * * Time Complexity:- O(n*logn).
     * ! Space Complexity:- O(n).
     */
    public static int missingNumber2(int[] nums) {
        int n = nums.length;

        // * Create an array of size n and initialize it with all the numbers from 0-n.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // * Sort the input array.
        Arrays.sort(nums);

        // * We iterate over the input array and the auxiliary array in parallel and
        // * return the index at which the two arrays differ.
        for (int i = 0; i < n; i++) {
            if (arr[i] != nums[i])
                return arr[i];
        }
        return n;
    }
    // *--------------------------------------------------------------------------------------

    /**
     * ? Method-03:- Using Sorting.
     * * Time Complexity:- O(n*logn).
     * ! Space Complexity:- O(1).
     */
    public static int missingNumber3(int[] nums) {
        int n = nums.length;

        // * Sort the input array.
        Arrays.sort(nums);

        // * Check if the current index is not equal to the current element.
        for (int i = 0; i < n; i++) {
            if (nums[i] != i)
                return i;
        }
        return n;
    }
    // *--------------------------------------------------------------------------------------

    /**
     * ? Method-04:- Using Cyclic Sort .
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(1).
     */
    public static int missingNumber4(int[] nums) {
        int n = nums.length;

        // * Iterate through the array and swap each element with its correct index.
        int idx = 0;
        while (idx < n) {
            int correct_idx = nums[idx];
            if (nums[idx] != n && nums[idx] != nums[correct_idx]) {
                int temp = nums[idx];
                nums[idx] = nums[correct_idx];
                nums[correct_idx] = temp;
            } else {
                idx++;
            }
        }

        // * Iterate through the array again and return the index of the first element
        // * that is not equal to its index.
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return n;
    }
    // *--------------------------------------------------------------------------------------

    /**
     * ? Method-05:- Using Sum Technique.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(1).
     */
    public static int missingNumber5(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int num = missingNumber5(nums);
        System.out.println(num);
    }
}
