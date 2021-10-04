package arrays;

import java.util.Arrays;

public class CheckSum {

    public static void main(String[] args) {
        int target = 81;
        int[] arr = {1,21,3, 14, 5, 60, 7 ,6};
        System.out.println(Arrays.toString(findSum(arr, target)));
    }

    private static int[] findSum(int[] arr, int target) {
        int high = arr.length-1;
        quickSort(arr, 0, high);
        int pointerOne = 0;
        int pointerTwo = arr.length-1;
        int sum;
        int[] result = new int[2];

        while (pointerOne < pointerTwo){
            sum = arr[pointerOne] + arr[pointerTwo];
            if (sum < target){
                pointerOne++;
            }
            else{
                if (sum > target){
                    pointerTwo--;
                }
                else{
                    result[0] = arr[pointerOne];
                    result[1] = arr[pointerTwo];
                    return result;
                }
            }
        }
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivotPosition = partition(arr, low, high);
            quickSort(arr, low, pivotPosition-1);
            quickSort(arr, pivotPosition+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int j = low - 1;
        int pivot = arr[high];
        for (int i = low; i <= high-1; i++) {
            if (arr[i] < pivot){
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, j+1, high);
        return j+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
