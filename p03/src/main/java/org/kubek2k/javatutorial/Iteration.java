package org.kubek2k.javatutorial;

public class Iteration {

    private int [] arr;

    public Iteration(final int[] arr) {
        this.arr = arr;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

    private class MyIterator {

        public boolean hasNext() {
            return true;
        }

        public int next() {
            return 0;
        }
    }

    public static void main(String[] args) {
        Iteration iteration = new Iteration(new int [] {1, 2, 3, 4});
        final MyIterator iterator = iteration.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
