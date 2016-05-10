package org.kubek2k.javatutorial.irrelevant;

public class IrrelevantAssert {
    public static void assertThat(boolean condition) {
        if (!condition) {
            throw new RuntimeException("Condition is not met");
        }
    }


}
