package googleChallanges;

public class EnRouteSalute {
    public static int solution(String s){
        int startPosition = 0;
        int sumOfSalutes = 0;

        int firstPositionOfRightGoingOfficer= 0;
        while(firstPositionOfRightGoingOfficer != -1){
            firstPositionOfRightGoingOfficer = findPositionOfFirstRightGoingOfficer(s, startPosition);
            if (firstPositionOfRightGoingOfficer != -1){
                int numberOfLeftGoingOfficers = findNumberOfLeftGoingOfficersAfterThisPosition(s, firstPositionOfRightGoingOfficer);
                sumOfSalutes += (numberOfLeftGoingOfficers * 2);
            }
            startPosition = firstPositionOfRightGoingOfficer+1;
        }
        return sumOfSalutes;
    }

    private static int findNumberOfLeftGoingOfficersAfterThisPosition(String s, int startingSearchPosition){
        int count = 0;
        for (int i = startingSearchPosition; i < s.length(); i++) {
            if (s.charAt(i) == '<'){
                count++;
            }
        }
        return count;
    }

    private static int findPositionOfFirstRightGoingOfficer(String s, int startPosition) {
        return s.indexOf('>', startPosition);
    }

    public static void main(String[] args) {
        int ans = solution("<<>><");
        System.out.println(ans);
    }
}
