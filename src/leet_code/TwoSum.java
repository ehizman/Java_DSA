package leet_code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] array, int target){
        int[] result = {-1,-1};
//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i] + array[j]== target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int q = 0; q < array.length; q++) {
            int remainder = target - array[q];
            if(map.containsKey(remainder)){
                result[0] = map.get(remainder);
                result[1] = q;
            }
            else{
                map.put(array[q], q);
            }
        }
        return result;
    }
}
