package arrays;

public class TuringTest {
    public static void main(String[] args) {
        String result = solution("ab-cd");
        System.out.println(result);
    }

    private static String solution(String s) {
        char[] chars = s.toCharArray();
        int firstPointer = 0;
        int secondPointer = s.length()-1;

        while(firstPointer < secondPointer){
            while(!((chars[firstPointer]+"").matches("[a-zA-Z]"))){
                firstPointer++;
            }
            while(!((chars[secondPointer]+"").matches("[a-zA-Z]"))){
                secondPointer--;
            }
            swap(chars, firstPointer, secondPointer);
            firstPointer++;
            secondPointer--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }

    private static void swap(char[] chars, int firstPointer, int secondPointer) {
        char temp = chars[firstPointer];
        chars[firstPointer] = chars[secondPointer];
        chars[secondPointer] = temp;
    }
}
