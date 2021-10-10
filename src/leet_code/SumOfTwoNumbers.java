package leet_code;

import java.util.LinkedList;

public class SumOfTwoNumbers {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer>listOne, LinkedList<Integer> listTwo){
        int firstNumber = extractDataFromList(listOne);
        int secondNumber = extractDataFromList(listTwo);
        int sum = firstNumber + secondNumber;
        LinkedList<Integer> resultingList = new LinkedList<>();
        while (sum != 0){
            resultingList.add(sum%10);
            sum = sum/10;
        }
        return resultingList;
    }

    public static int extractDataFromList(LinkedList<Integer> listOne) {
        int sum = 0;
        while (!listOne.isEmpty()){
            sum = (sum*10)+listOne.poll();
        }
        int number = 0;
        while(sum!=0){
            number = (number*10)+(sum%10);
            sum = sum/10;
        }
        return number;
    }

}
