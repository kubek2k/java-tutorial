package org.kubek2k.javatutorial;

public class FloatComparison {

    private static final float DELTA = 0.00001f;

    public static boolean compare(float a, float b) {
        return a == b;
    }

    public static void main(String[] args) {
        float a = 3.6f;
        float b = 1.2f;
        float c = 3;
        System.out.println(compare(a, b * c));
    }
}
