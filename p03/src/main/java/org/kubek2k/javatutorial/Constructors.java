package org.kubek2k.javatutorial;

public class Constructors {

    public static class A {

        protected final String s;

        public A(String s) {
            this.s = s;
        }


    }

    public static class B extends A {

        private final String z;

        public B(final String s, final String z) {
            this.z = z;
        }

        public void m() {
            System.out.println(this.s + this.z);
        }
    }

    public static void main(String[] args) {
        B b = new B("Hello", "Kitty");
        b.m();
    }
}
