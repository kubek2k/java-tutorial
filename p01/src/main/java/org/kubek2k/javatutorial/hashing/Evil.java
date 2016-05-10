package org.kubek2k.javatutorial.hashing;

import static org.kubek2k.javatutorial.irrelevant.IrrelevantAssert.assertThat;
import static org.kubek2k.javatutorial.irrelevant.Timer.measureTime;

import java.util.HashSet;
import java.util.Set;

public class Evil {

    private int x;

    public Evil(final int x) {
        this.x = x;
    }

    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) throws Exception {
        measureTime(new Runnable() {
            public void run() {
                final Set<Evil> evils = new HashSet<Evil>();
                for(int i = 0; i < 10000; i++) {
                    evils.add(new Evil(i));
                }
                assertThat(evils.contains(new Evil(0)));
            }
        });
    }
}
