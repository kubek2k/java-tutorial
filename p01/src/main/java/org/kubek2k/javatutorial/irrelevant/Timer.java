package org.kubek2k.javatutorial.irrelevant;

import java.util.Date;

public class Timer {

    public static <T> void measureTime(Runnable c) throws Exception {
        final long start = new Date().getTime();
        try {
            c.run();
        } finally {
            final long end = new Date().getTime();
            System.out.println("Call has taken " + (end - start) + " milliseconds");
        }
    }
}
