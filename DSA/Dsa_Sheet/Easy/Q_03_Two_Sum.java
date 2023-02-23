// Todo:- ( Two Sum :- https://bit.ly/2oCDW1E )

package DSA.Dsa_Sheet.Easy;

import java.util.Arrays;

public class Q_03_Two_Sum {

    /**
     * ? Method-01:- Using Two For Loops.
     * * Time Complexity:- O(n^2).
     * ! Space Complexity:- O(1).
     */
    public static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;
        int[] res = twoSum1(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
