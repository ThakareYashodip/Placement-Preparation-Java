public class NxtPermutation {

    public static void nextPermutation(int [] nums){
         boolean[] a = new boolean[nums.length];
        for (int num : nums) {
            if(a[num]) {
                return num;
            }
            a[num] = true;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
    }
}
