package arrays;

import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int[] array ={10, 7, 8, 9, 1, 5};
        int high = array.length-1;
        int low = 0;
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high){
            int pivotPosition = partition(array, low, high);
            quickSort(array, low, pivotPosition-1);
            quickSort(array, pivotPosition+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low -  1;
        for (int j = low; j <= high-1; j++) {
            if (array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return 1+i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}