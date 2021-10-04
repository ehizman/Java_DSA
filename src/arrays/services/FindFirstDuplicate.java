package arrays.services;

public class FindFirstDuplicate {
    public static void main(String[] args) {
        int[] arr =  {2, 2, 3, 2, 6, 6};
        int firstNonDuplicate = findFirstUnique(arr);
        System.out.println(firstNonDuplicate);
    }

    private static int findFirstUnique(int[] arr) {
        boolean isDuplicated;
        for (int i = 0; i < arr.length-1; i++) {
            isDuplicated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                    continue;
                }
                if (arr[i] == arr[j]) {
                    isDuplicated = true;
                    break;
                }
            }
            if (!isDuplicated){
                return arr[i];
            }
        }
        return -1;
    }
}
