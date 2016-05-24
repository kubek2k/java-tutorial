package org.kubek2k.javatutorial;

import java.util.ArrayList;
import java.util.Collection;

public class Container {

    private static class A {
        int i;

        public A(final int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) {
        Collection<A> c = new ArrayList<A>();
        c.add(new A(1));
        c.add(new A(2));
        c.add(new A(3));
        c.add(new A(4));

        System.out.print(c.contains(new A(3)) + " " + c.contains(new A(5)));
    }
}
