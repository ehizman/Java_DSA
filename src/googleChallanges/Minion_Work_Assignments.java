package googleChallanges;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Minion_Work_Assignments {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(2);
        data.add(3);
        data.add(3);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(5);
        int n = 1;
        List<Integer> result = solution(data, n);

        System.out.println(result);
    }

    private static List<Integer> solution(List<Integer> data, int n) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        if (data.size() > 99 || data.size() < 1){
            return null;
        }
        for (int element: data) {
            if (!map.containsKey(element)){
                map.put(element, 1);
            }
            else{
                int count = map.get(element);
                count++;
                map.put(element, count);
            }
        }
        for (int key: map.keySet()) {
            if (map.get(key) > n){
                data.removeAll(List.of(key));
            }
        }
        return data;
    }
}
