package org.kubek2k.javatutorial;

import java.util.Arrays;
import java.util.List;

public class ArrayFromList {
    public static void main(String[] args) {
        final List<Integer> l = Arrays.asList(1, 2, 3, 4);
        final Integer [] arr = l.toArray();
    }
}
