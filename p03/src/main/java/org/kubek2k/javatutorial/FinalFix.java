package org.kubek2k.javatutorial;

public class FinalFix {

    private static final String SOME_STATIC_STRING;

    public final String s;

    public static void main(String[] args) {
        System.out.println(SOME_STATIC_STRING);
        System.out.println(new FinalFix().s);
    }
}
