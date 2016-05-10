package org.kubek2k.javatutorial.equality;

import static org.kubek2k.javatutorial.irrelevant.IrrelevantAssert.assertThat;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");

        // FIXME
        assertThat(s1 != s2);
        assertThat(s1.equals(s2));
        assertThat(s1 == s3);
        assertThat(!s1.equals(s3));
    }
}
