package org.kubek2k.javatutorial.print;

public class Printing2 {

    private String s;

    public Printing2(final String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Printing2 p = new Printing2("abcd");
        System.out.println(p);
    }
}
