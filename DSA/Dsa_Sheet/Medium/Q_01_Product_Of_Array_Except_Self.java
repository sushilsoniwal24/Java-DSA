// Todo:- ( Product of Array Except Self:- https://bit.ly/3xrBTjZ )

package DSA.Dsa_Sheet.Medium;

import java.util.Arrays;

public class Q_01_Product_Of_Array_Except_Self {

    /**
     * ? Method-01 :- Using Two Loops {TLE}.
     * ! Time Complexity = O(N*N).
     * ? Space Complexity = O(1).
     */
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    pro *= nums[j];
                }
            }
            ans[i] = pro;
        }
        return ans;
    }
    // *-------------------------------------------------------------------

    /**
     * ? Method-02 :- Using Division Operator (Not Work For '0').
     * ! Time Complexity = O(N).
     * ? Space Complexity = O(1).
     */
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int pro = 1;
        for (int num : nums) {
            pro *= num;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
    // *-------------------------------------------------------------------

    /**
     * ? Method-03 :- Using Prefix & Suffix Products In 2 Different Arrays.
     * ! Time Complexity = O(N).
     * ? Space Complexity = O(N).
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre_pro = new int[n];
        int[] suf_pro = new int[n];

        pre_pro[0] = 1;
        suf_pro[n - 1] = 1;

        // * Calculate Prefix Product.
        for (int i = 1; i < n; i++) {
            pre_pro[i] = pre_pro[i - 1] * nums[i - 1];
        }

        // * Calculate Suffix Product.
        for (int i = n - 2; i >= 0; i--) {
            suf_pro[i] = suf_pro[i + 1] * nums[i + 1];
        }

        // * Calculating Required Solution.
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre_pro[i] * suf_pro[i];
        }
        return ans;
    }
    // *-------------------------------------------------------------------

    /**
     * ? Method-04 :- Using Prefix & Suffix Products Using Only Answer Array.
     * ! Time Complexity = O(N).
     * ? Space Complexity = O(1).
     */
    public static int[] productExceptSelf4(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        // * Calculate Prefix Product.
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // * Calculate Suffix Product.
        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * temp;
            temp = temp * nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = productExceptSelf4(nums);
        System.out.println(Arrays.toString(res));
    }
}
