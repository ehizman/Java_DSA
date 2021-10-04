package arrays;

import java.util.Arrays;

class CheckMergeArray
{
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        // write your code here
        int lengthOfFirstArray = arr1.length;
        int lengthOfSecondArray = arr2.length;
        int lengthOfResultingArray =lengthOfSecondArray + lengthOfFirstArray;
        int[] resultingArray = new int[lengthOfResultingArray];

        for(int i = 0; i < arr1.length; i++){
            resultingArray[i] = arr1[i];
        }
        int low = -1;
        for(int i = 0; i < arr2.length; i++){
            int insertionPoint = binarySortArray(resultingArray, arr2[i], low+1, arr1.length-1+i);
            for(int j = arr1.length + i; j > insertionPoint; j--){
                resultingArray[j] = resultingArray[j-1];
            }
            resultingArray[insertionPoint] = arr2[i];
            low = insertionPoint;
        }
        arr1 = resultingArray;
        return arr1; // make a new resultant array and return your results in that
    }
    private static int binarySortArray(int[] arrayToBeSorted, int valueToInsert, int low, int high){
        while(low <= high){
            int mid = low + ((high - low)/2);

            if (arrayToBeSorted[mid] == valueToInsert){
                return mid + 1;
            }
            else{
                if (arrayToBeSorted[mid] < valueToInsert){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arrayOne = {2, 8, 9, 15, 21};
        int[] arrayTwo = {5, 9, 10, 34, 45};
        int[] resultingArray = mergeArrays(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(resultingArray));
    }
}
