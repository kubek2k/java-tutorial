package org.kubek2k.javatutorial;

public class Widening {

    public static void main(String[] args) {
        int i = 1;
        double d = 2;
        float f = 3;
        short s = 4;
        long l = 5;
        byte b = 6;
        printSum(b, f);
        printSum(b, d);
        printSum(i, f);
        printSum(i, d);
        printSum(s, f);
        printSum(s, d);
        printSum(l, f);
        printSum(l, d);
        printSum(b, b);
        printSum(i, i);
        printSum(s, s);
        printSum(l, l);
    }

    private static void printSum(short i, float d) {
        System.out.println(i + d);
    }
}
