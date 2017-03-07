package org.kubek2k.javatutorial;

public class FifthSmallest {

    public static int fifthSmallest(int [] arr) {
        int [] buffer = new int [5];
        return 0;
    }

    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int [] arr2 = new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(fifthSmallest(arr1) == 5);
        System.out.println(fifthSmallest(arr2) == 4);
    }
}
