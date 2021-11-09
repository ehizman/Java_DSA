package arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
       if (digits[digits.length-1] < 9){
           digits[digits.length-1]++;
       }
       else{
           boolean isAdded = false;
           int count = digits.length-2;
           while((!isAdded)&&(count>=0)){
               if (digits[count] < 9){
                   digits[count]++;
                   isAdded = true;
               }
               else{
                   count--;
               }
           }
           if (!isAdded){
               int[] newArray = new int[digits.length+1];
               newArray[0] = 1;
               return newArray;
           }
       }
       return digits;
    }

    public static void main(String[] args) {
//    int[] nums = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
    int[] nums = {9,9,9};
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }
}
