package Task1;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[][] arr = new int[5][5];
        Random rand = new Random();
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mean = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = rand.nextInt(50);
                arr[i][j] = value;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        mean = (max + min) / 2;
        System.out.println("mean = " + mean);
    }

}
