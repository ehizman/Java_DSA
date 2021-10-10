package googleChallanges;

public class Grandest_Stairs_Of_Them_All {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    public static int solution(int n){
        int[][] memo = new int[n +2][n +2];
        int count = findCount(1, n, memo);
        return count-1;
    }

    private static int findCount(int heightOfStairs, int numberOfBricksLeft, int[][] memo) {
        if (memo[heightOfStairs][numberOfBricksLeft] != 0){
            return memo[heightOfStairs][numberOfBricksLeft];
        }

        if (numberOfBricksLeft == 0){
            return 1;
        }

        if (numberOfBricksLeft < heightOfStairs){
            return 0;
        }

        int result = (findCount(heightOfStairs+1, numberOfBricksLeft-heightOfStairs, memo) + findCount(heightOfStairs+1, numberOfBricksLeft, memo));
        memo[heightOfStairs][numberOfBricksLeft] = result;
        return result;
    }
}
