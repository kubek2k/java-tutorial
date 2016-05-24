package org.kubek2k.javatutorial;

import java.util.Date;
import java.util.List;

public class ComparingLists {

    public static void time(final Runnable r) {
        long start = new Date().getTime();
        try {
            r.run();
        } finally {
            long end = new Date().getTime();
            System.out.println("Time taken " + (end - start));
        }
    }

    public static void main(String[] args) {
        time(new Runnable() {
            public void run() {
                final List<Integer> l1 = null;
                for (int i = 0; i < 100000; i++) {
                    l1.add(i);
                }

                for (int i = 100; i < 50000; i++) {
                    l1.remove(0);
                }
            }
        });

        time(new Runnable() {
            public void run() {
                final List<Integer> l2 = null;
                for (int i = 0; i < 100000; i++) {
                    l2.add(i);
                }

                for (int i = 100; i < 50000; i++) {
                    l2.get(i);
                }
            }
        });

        time(new Runnable() {
            public void run() {
                final List<Integer> l3 = null;
                for (int i = 0; i < 100000; i++) {
                    l3.add(i);
                }

                for (int i = 100; i < 50000; i++) {
                    l3.clear();
                }

                for (int i = 0; i < 100000; i++) {
                    l3.add(i);
                }
            }
        });
    }
}
