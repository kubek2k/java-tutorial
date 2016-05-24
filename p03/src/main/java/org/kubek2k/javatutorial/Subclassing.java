package org.kubek2k.javatutorial;

public class Subclassing {

    public static class A {
        protected int a = 1;
    }

    public static class B extends A {
        protected int a = 2;

        public void m() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.m();
    }
}
