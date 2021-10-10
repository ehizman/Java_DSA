package arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2,5,-1,10,-14,-20};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int pivot = i-1;

            while (pivot>=0 && array[pivot] > key){
                array[pivot+1] = array[pivot];
                pivot--;
            }
            array[pivot+1] = key;
        }
    }
}
