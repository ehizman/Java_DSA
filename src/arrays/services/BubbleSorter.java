package arrays.services;

import arrays.exceptions.ArraysSorterException;

public class BubbleSorter implements  ArraysSorter {
    @Override
    public int[] sortAscending(int[] array) throws ArraysSorterException {
        if (array == null){
            throw new ArraysSorterException("array to sortAscending cannot be null");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    array[i] = array[i]+array[j];
                    array[j] = array[i]-array[j];
                    array[i] = array[i]-array[j];
                }
            }
        }
        return array;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraysSorterException {
        if (arrayToSort == null){
            throw new ArraysSorterException("array to sortAscending cannot be null");
        }
        int temp;
        for (int i = 0; i < arrayToSort.length-1; i++) {
            for (int j = i+1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] < arrayToSort[j]){
                    arrayToSort[i] = arrayToSort[i]+arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i]-arrayToSort[j];
                    arrayToSort[i] = arrayToSort[i]-arrayToSort[j];
                }
            }
        }
        return arrayToSort;
    }
}
