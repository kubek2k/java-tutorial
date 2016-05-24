package org.kubek2k.javatutorial;

public class InnerClass {

    private static class Outer {

        protected int a = 1;

        public void m() {
            new Inner().m();
        }

        private class Inner {

            protected int a = 2;

            public void m() {
                new EvenMoreInner().m();
            }

            private class EvenMoreInner {
                private int a = 3;

                public void m() {
                    System.out.println(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.m();
    }
}
