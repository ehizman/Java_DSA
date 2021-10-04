package arrays.services;

import arrays.exceptions.ArraysSorterException;

public class BinarySorter implements ArraysSorter{

    @Override
    public int[] sortAscending(int[] arrayToSort){
        int currentIndex;
        int selectedValue;
        for (int i = 1; i < arrayToSort.length; i++) {
            currentIndex = i-1;
            selectedValue = arrayToSort[i];
            int correctPosition = binarySearch(arrayToSort, selectedValue, 0, currentIndex);
            while (currentIndex >= correctPosition){
                arrayToSort[currentIndex+1] = arrayToSort[currentIndex];
                currentIndex--;
            }
            arrayToSort[currentIndex+1] = selectedValue;
        }
        return arrayToSort;
    }

    private int binarySearch(int[] arrayToSort, int selectedValue, int startPosition, int currentIndex) {
        while (startPosition <= currentIndex){
            int mid = startPosition + ((currentIndex-startPosition)/2);
            if (selectedValue == arrayToSort[mid]){
                return mid + 1;
            }
            else{
                if (selectedValue < arrayToSort[mid]){
                    currentIndex = mid-1;
                }
                else{
                    startPosition = mid + 1;
                }
            }
        }
        return startPosition;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort){
        return new int[0];
    }
}
