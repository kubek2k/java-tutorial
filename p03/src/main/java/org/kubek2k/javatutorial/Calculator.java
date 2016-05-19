package org.kubek2k.javatutorial;

public class Calculator {

    private interface Operator {
        int apply(int right, int left);
    }

    public int calculate(String formula) {

    }

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("2 + 1"));
        System.out.println(calculator.calculate("3 - 4"));
        System.out.println(calculator.calculate("3 + 3"));
        System.out.println(calculator.calculate("5 * 10 + 3"));
    }
}
