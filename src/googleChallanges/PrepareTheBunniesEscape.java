package googleChallanges;

import java.util.*;

public class PrepareTheBunniesEscape {
    public static void main(String[] args) {
        int[][] map = new int[4][];
        map[0] = new int[]{0,1,1,0};
        map[1] = new int[]{0,1,0,1};
        map[2] = new int[]{1,1,0,0};
        map[3] = new int[]{1,1,1,0};
        int[][] _map = {{0,1,1,0},{0,1,0,1},{1,1,0,0},{1,1,1,0}};
        int length = solution(_map);
        System.out.println(length);
    }
    public static int solution(int[][] map) {
        int count = map.length * (map[0].length);
        int[] predecessors = new int[count];
        int[] distances = new int[count];
        int source = 0;
        int destination = count-1;
        boolean canTraverseLeftAndBottom = checkIfLeftSideOfWallAndBottomHasOnlyOne_1(map);
        boolean canTraverseTopAndRight = checkIfRightSideOfWallAndTopHasOnlyOne_1(map);
        if (canTraverseLeftAndBottom){
            return (map.length + map[map.length-1].length - 1);
        }
        else{
            if(canTraverseTopAndRight){
                return (map[0].length + map.length - 1);
            }
            else{
                search(map, source, destination, predecessors, distances);
            }
        }
        return distances[destination];
    }

    public static void search(int[][] map, int source, int destination, int[] predecessors, int[] distances) {
        boolean[] visited = new boolean[destination+1];
        Queue<Integer> queue = new LinkedList<>();
        int height = map.length;
        int width = map[0].length;
        queue.add(source);
        int current = 0;
        int x_coordinate = 0;
        int y_coordinate = 0;
        visited[source] = true;
        distances[source] = 1;

        while (!queue.isEmpty()){
            current = queue.poll();
            x_coordinate = current/width;
            y_coordinate = current%width;

            if(x_coordinate+1 < height){
                if (map[x_coordinate+1][y_coordinate] == 0) {
                    int node = ((x_coordinate+1) * width) + y_coordinate;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
            if (y_coordinate+1 < width){
                if (map[x_coordinate][y_coordinate+1] == 0) {
                    int node = (x_coordinate * width) + y_coordinate + 1;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
            if (y_coordinate-1 >= 0){
                if (map[x_coordinate][y_coordinate-1] == 0) {
                    int node = ((x_coordinate) * width) + y_coordinate-1;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
        }
        if (current != destination){
            if((x_coordinate+1) < height){
                int node = ((x_coordinate+1) * width) + y_coordinate;
                if (!visited[node]) {
                    visited[node] = true;
                    predecessors[node] = current;
                    distances[node] = distances[current]+1;
                    queue.add(node);
                }
            }
            if((y_coordinate+1) < width){
                int node = (x_coordinate * width) + y_coordinate + 1;
                if (!visited[node]) {
                    visited[node] = true;
                    predecessors[node] = current;
                    distances[node] = distances[current]+1;
                    queue.add(node);
                }
            }
            if (y_coordinate-1 >= 0){
                int node = ((x_coordinate) * width) + y_coordinate-1;
                if (!visited[node]) {
                    visited[node] = true;
                    predecessors[node] = current;
                    distances[node] = distances[current]+1;
                    queue.add(node);
                }
            }
        }
        while (!queue.isEmpty()){
            current = queue.poll();
            x_coordinate = current/width;
            y_coordinate = current%width;

            if(x_coordinate+1 < height){
                if (map[x_coordinate+1][y_coordinate] == 0) {
                    int node = ((x_coordinate+1) * width) + y_coordinate;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
            if (y_coordinate+1 < width){
                if (map[x_coordinate][y_coordinate+1] == 0) {
                    int node = (x_coordinate * width) + y_coordinate + 1;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
            if (x_coordinate-1 >= 0){
                if (map[x_coordinate-1][y_coordinate] == 0) {
                    int node = ((x_coordinate-1) * width) + y_coordinate;
                    if (!visited[node]) {
                        visited[node] = true;
                        predecessors[node] = current;
                        distances[node] = distances[current]+1;
                        queue.add(node);
                    }
                }
            }
        }
    }


    private static boolean checkIfRightSideOfWallAndTopHasOnlyOne_1(int[][] map) {
        int countOfOnes = 0;
        for (int element : map[0]) {
           if (element==1){
               countOfOnes++;
           }
        }
        for (int[] row: map) {
            if (row[row.length-1] == 1){
                countOfOnes++;
            }
        }
        return countOfOnes<2;
    }

    private static boolean checkIfLeftSideOfWallAndBottomHasOnlyOne_1(int[][] map) {
        int countOfOnes = 0;
        for (int[] row : map) {
            if (row[0] == 1) {
                countOfOnes++;
            }
        }

        for (int element: map[map.length-1]) {
            if (element == 1){
                countOfOnes++;
            }
        }
        return countOfOnes < 2;
    }
}
