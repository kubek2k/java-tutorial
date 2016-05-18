package org.kubek2k.javatutorial;

public class Autoboxing {

    public static void print(char c) {
        printObject(c);
    }

    public static void print(int i) {
        printObject(i);
    }

    public static void print(byte b) {
        printObject(b);
    }

    public static void print(short s) {
        printObject(s);
    }

    public static void print(long l) {
        printObject(l);
    }

    public static void print(double d) {
        printObject(d);
    }

    public static void print(float f) {
        printObject(f);
    }

    public static void printObject(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Integer i = null;
        Double d = null;
        Float f = null;
        Short s = null;
        Long l = null;
        Byte b = null;
        Character c = null;

        print(i);
        print(d);
        print(f);
        print(s);
        print(l);
        print(b);
        print(c);
    }

}
