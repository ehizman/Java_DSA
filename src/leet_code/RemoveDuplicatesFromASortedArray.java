package leet_code;

public class RemoveDuplicatesFromASortedArray {
    int[] array = {2,5,5,5,9,23,28};

    public static int solution(int[] nums) {
        int positionOfFirstNonDuplicate = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]){
                int temp = nums[positionOfFirstNonDuplicate];
                nums[positionOfFirstNonDuplicate] = nums[i+1];
                nums[i+1] = temp;
//                nums[positionOfFirstNonDuplicate] = nums[i+1];
                positionOfFirstNonDuplicate++;
            }
        }
        return positionOfFirstNonDuplicate;
    }
}
