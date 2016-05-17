package org.kubek2k.javatutorial;

import java.util.Arrays;

public class SpiralArray {

    public static int[][] spiralArray(int[] input) {
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[16];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int[][] output = spiralArray(arr);
        int[][] expected = new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{12, 13, 14, 5},
                new int[]{11, 16, 15, 6},
                new int[]{10, 9, 8, 7}
        };
        System.out.println(Arrays.equals(output, expected));
    }
}
