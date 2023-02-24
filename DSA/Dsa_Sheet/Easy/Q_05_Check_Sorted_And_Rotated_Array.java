// Todo:- (Check if Array Is Sorted and Rotated:- https://bit.ly/3K9axGU)

package DSA.Dsa_Sheet.Easy;

public class Q_05_Check_Sorted_And_Rotated_Array {

    /**
     * ? Method-01:- Check For Wrong Order.
     * * Time Complexity:- O(n).
     * ! Space Complexity:- O(1).
     */
    public static boolean check(int[] nums) {
        int n = nums.length;
        int wrong_order = 0;

        // * Check For Wrong Order In The Array.
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                wrong_order++;
            }
        }

        // * Check If First & Last Elements Are In Wrong Order.
        if (nums[n - 1] > nums[0]) {
            wrong_order++;
        }

        return (wrong_order <= 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(check(arr));
    }
}
