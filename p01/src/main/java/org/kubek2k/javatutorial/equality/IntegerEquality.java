package org.kubek2k.javatutorial.equality;

import static org.kubek2k.javatutorial.irrelevant.IrrelevantAssert.assertThat;

public class IntegerEquality {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = 1;
        Integer i4 = new Integer(1);

        assertThat(i1 != i2);
        assertThat(i1 == i3);
        assertThat(i1 == i4);
        assertThat(!i1.equals(i4));
    }
}
