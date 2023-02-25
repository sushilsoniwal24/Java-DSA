// Todo:- (Contains Duplicate:-https://leetcode.com/problems/contains-duplicate/description/)

package DSA.Dsa_Sheet.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_08_Contains_Duplicate {

    /**
     * ? Method-01:- Using Two For Loops.
     * * Time Complexity:- O(n^2).
     * ! Space Complexity:- O(1).
     */
    public static boolean containsDuplicate1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // *-----------------------------------------------------------

    /**
     * ? Method-02:- Using Sorting.
     * * Time Complexity:- O(n*logn).
     * ! Space Complexity:- O(1).
     */
    public static boolean containsDuplicate2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
    // *-----------------------------------------------------------

    /**
     * ? Method-03:- Using Set Data Structure.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(n).
     */
    public static boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate3(nums));
    }
}
