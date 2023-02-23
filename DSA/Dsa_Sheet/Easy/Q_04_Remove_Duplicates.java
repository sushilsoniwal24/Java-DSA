// Todo:- ( Remove Duplicates From Sorted Array:- https://bit.ly/2Kjr4py)

package DSA.Dsa_Sheet.Easy;

public class Q_04_Remove_Duplicates {

    /**
     * ? Method-01:- Using Two Pointers.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(1).
     */
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j++];
            } else
                j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}
