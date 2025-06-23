package G04_DSA_Core.Arrays;

import java.util.Arrays;

public class ChocoDistribution {

    public static int findMinDiff(int nums[], int m) {
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i + m - 1 < nums.length; i++) {
            int diff = nums[i + m - 1] - nums[i];

            if (diff < mindiff) {
                mindiff = diff;
            }
        }
        return mindiff;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;
        
        System.out.println(findMinDiff(arr, m));
    }
}
