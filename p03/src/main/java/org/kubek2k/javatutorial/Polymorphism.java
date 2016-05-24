package org.kubek2k.javatutorial;

public class Polymorphism {

    public static abstract class A {
        abstract void m();
    }

    public static class B extends A {

        @Override
        protected void m() {
            System.out.println("B");
        }
    }

    public static class C extends A {

        @Override
        protected void m() {
            System.out.println("C");
        }
    }

    public static class D extends C {

    }

    public static void main(String[] args) {
        A [] arr = new A [] {new B(), new D()};
        for(A a : arr) {
            a.m();
        }
    }
}
