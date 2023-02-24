// Todo:- (Move Zeros :- https://leetcode.com/problems/move-zeroes/description/ )

package DSA.Dsa_Sheet.Easy;

import java.util.Arrays;

public class Q_06_Move_Zeros {

    /**
     * ? Method-01:- Creating An Extra Array.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(n).
     */
    public static void moveZeroes1(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[idx++] = nums[i];
            }
        }

        // * Fill Remaining Indexes With 0.
        while (idx < n) {
            temp[idx++] = 0;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
    // *-------------------------------------------------------------

    /**
     * ? Method-02:- Using Two Pointers.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(n).
     */
    public static void moveZeroes2(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
    }

    // Todo:- Method To Swap Two Numbers Of Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 12, 0 };
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
