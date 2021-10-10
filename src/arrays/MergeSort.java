package arrays;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array){
        if (array.length > 1){
            int lengthOfFirstArray = array.length / 2;
            int[] firstArray = new int[lengthOfFirstArray];
            System.arraycopy(array, 0, firstArray, 0, lengthOfFirstArray);
            mergeSort(firstArray);

            int lengthOfSecondArray = array.length - lengthOfFirstArray;
            int[] secondArray = new int[lengthOfSecondArray];
            System.arraycopy(array, lengthOfFirstArray, secondArray, 0, lengthOfSecondArray);
            mergeSort(secondArray);
            
            merge(firstArray, secondArray, array);
        }

    }

    private static void merge(int[] firstArray, int[] secondArray, int[] array) {
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int thirdArrayIndex = 0;

        while(secondArrayIndex < secondArray.length && firstArrayIndex < firstArray.length){
            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
                array[thirdArrayIndex++] = firstArray[firstArrayIndex++];
            }
            else{
                array[thirdArrayIndex++] = secondArray[secondArrayIndex++];
            }
        }
        while(firstArrayIndex < firstArray.length){
            array[thirdArrayIndex++] = firstArray[firstArrayIndex++];
        }
        while(secondArrayIndex < secondArray.length){
            array[thirdArrayIndex++] = secondArray[secondArrayIndex++];
        }
    }
    public static void main(String[] args) {
        int[] array = {2,7,11,5,-3,20};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
