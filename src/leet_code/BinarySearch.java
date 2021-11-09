package leet_code;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        return binarySearch(nums, low, high, target);
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        int mid = (low + (high - low))/2;
        if (target == nums[mid]){
            return mid;
        }
        else{
            if(target < nums[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            return binarySearch(nums, low, high, target);
        }
    }
}

class Main{
    public static void main(String[] args) {
        int[] nums = {2,6,9,12,13,15};
        int target = 12;
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search(nums, target);
        System.out.println(index);
    }
}
