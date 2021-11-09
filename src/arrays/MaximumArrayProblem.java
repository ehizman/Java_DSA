package arrays;

public class MaximumArrayProblem {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);
        System.out.println(max);
    }
    public static int maxSubArray(int[] nums) {
        int sumOfSubArrays = 0;
        int maximum = Integer.MIN_VALUE;
        for (int num : nums) {
            sumOfSubArrays += num;
            maximum = Math.max(maximum, sumOfSubArrays);
            if (sumOfSubArrays < 0){
                sumOfSubArrays = 0;
            }
        }
        return maximum;
    }
}
