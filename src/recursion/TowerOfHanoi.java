package recursion;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF DISCS TO MOVE");
        int numberOfDiscs = new Scanner(System.in).nextInt();

        move(numberOfDiscs, 'A', 'B', 'C');
    }

    private static void move(int numberOfDiscs, char fromTower, char toTower, char auxTower) {
        if (numberOfDiscs==1){
            System.out.println("Move Disc "+ numberOfDiscs +" from "+ fromTower+ " to "+ toTower);
        }
        else{
            move(numberOfDiscs-1, fromTower, auxTower, toTower);
            System.out.println("Move Disc "+ numberOfDiscs +" from "+ fromTower+ " to "+ toTower);
            move(numberOfDiscs-1, auxTower, toTower, fromTower);
        }
    }
}
