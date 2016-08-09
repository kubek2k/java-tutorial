import java.util.function.Function;

public class A {

    public static void method(Function<String, Integer> f) {

    }

    public static void main(String[] args) {
        B b = new B();
        method(b::parse);
    }

    private static class B {
        public Integer parse(String s) {
            return null;
        }
    }

    private enum C {
        X
    }
}
