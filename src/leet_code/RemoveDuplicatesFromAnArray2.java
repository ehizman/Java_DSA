package leet_code;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray2 {
    public static void main(String[] args) {
        int[] array = {2,4,5,5,5,2,4,5,6,7};
        int length = solution(array);
        System.out.println(Arrays.toString(array));
    }

    private static int solution(int[] array) {
        //sort array
        quicksort(array, 0, array.length-1);

        return 0;
    }

    private static void quicksort(int[] array, int low, int high) {
        if (low < high){
            int pivot = partition(array, low, high);
            quicksort(array, 0, pivot-1);
            quicksort(array, pivot+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int insertionPoint = low - 1;

        for (int i = low; i < high; i++) {
            if (array[i] < pivot){
                insertionPoint++;
                if (i!=insertionPoint){
                    swapElements(array, i, insertionPoint);
                }
            }
        }
        swapElements(array, insertionPoint+1, high);
        return insertionPoint+1;
    }

    private static void swapElements(int[] array, int i, int insertionPoint) {
        int temp = array[i];
        array[i] = array[insertionPoint];
        array[insertionPoint] = temp;
    }

}
