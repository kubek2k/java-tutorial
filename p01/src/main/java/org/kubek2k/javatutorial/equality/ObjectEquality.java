package org.kubek2k.javatutorial.equality;

import static org.kubek2k.javatutorial.irrelevant.IrrelevantAssert.assertThat;

public class ObjectEquality {

    public static class A {
        private String s;

        public A(final String s) {
            this.s = s;
        }

        public boolean equals() {
            // FIXME
            return false;
        }
    }

    public static void main(String[] args) {
        final A a1 = new A("x");
        final A a2 = new A("x");
        final A a3 = new A("y");

        assertThat(a1 != a2);
        assertThat(a1.equals(a2));
        assertThat(!a1.equals(a3));
    }
}
