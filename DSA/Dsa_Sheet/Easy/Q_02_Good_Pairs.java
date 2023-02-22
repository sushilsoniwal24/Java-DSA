// Todo:- (Number of Good Pairs:- https://bit.ly/3HVKqAv)

package DSA.Dsa_Sheet.Easy;

public class Q_02_Good_Pairs {

    /**
     * ? Method-01:- Using Two Loops.
     * * Time Complexity:- O(N^2).
     * ! Space Complexity:- O(1).
     */

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }
    // *---------------------------------------------------------

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int pairs = numIdenticalPairs(arr);
        System.out.println(pairs);
    }

}
