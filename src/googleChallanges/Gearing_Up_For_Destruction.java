package googleChallanges;

import java.util.Arrays;

public class Gearing_Up_For_Destruction {
    public static int[] solution(int[] pegs){
        boolean isEven = pegs.length % 2 == 0;

        if (pegs.length < 2 || pegs.length > 20){
            return new int[]{-1,-1};
        }

        if (pegs.length == 2){
            int distanceBetweenPegs = 2 * (pegs[1] - pegs[0]);
            if (distanceBetweenPegs % 3 != 0){
                return new int[]{distanceBetweenPegs, 3};
            }
            else{
                return new int[]{distanceBetweenPegs/3, 1};
            }
        }
        int sum;
        if (!isEven){//odd
            sum = pegs[pegs.length-1] + pegs[0];
        }
        else{// even
            sum = pegs[pegs.length-1] - pegs[0];
        }
        int radiusOfFirstGear = sum + findRadiusOfFirstGear(pegs);
        int denominator = 1;
        if (!isEven){
            radiusOfFirstGear = -2 * radiusOfFirstGear;
        }
        else{
            radiusOfFirstGear = radiusOfFirstGear * 2;
            denominator = 3;
        }
        boolean isValidSetup;
        if (!isEven){
            isValidSetup = checkIfAllGearsSatisfyCondition(pegs, radiusOfFirstGear);
        }
        else{
            isValidSetup = checkIfAllGearsSatisfyCondition(pegs, (float)radiusOfFirstGear/3);
        }
        if (isValidSetup){
            return new int[]{radiusOfFirstGear, denominator};
        }
        else{
            return new int[]{-1, -1};
        }
    }

    private static boolean checkIfAllGearsSatisfyCondition(int[] pegs, float radiusOfFirstGear) {
        float currentIndex = radiusOfFirstGear;
        float nextIndex;
        for (int i = 0; i < pegs.length-1; i++) {
            nextIndex = pegs[i+1] - pegs[i] - currentIndex;
            if (nextIndex < 1 || currentIndex < 1){
                return false;
            }
            currentIndex = nextIndex;
        }
        return true;
    }

    private static int findRadiusOfFirstGear(int[] pegs) {
        int sum = 0;
        for (int i = 1; i <= pegs.length-2; i++) {
            sum += Math.pow(-1, i) * pegs[pegs.length-1-i];
        }
        return 2*sum;
    }

    public static void main(String[] args) {
        int[] pegs = new int[]{4, 22};
        System.out.println(Arrays.toString(solution(pegs)));
    }
}
