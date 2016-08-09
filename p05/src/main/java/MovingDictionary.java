import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class MovingDictionary {

    public MovingDictionary(String test) {
        // FIXME
    }

    public Map<String, Integer> startingWith(char c) {
        return null;
    }

    public static void main(String[] args) {
        String text = "a b c ac ac a ab cd bd e f ee fg";
        MovingDictionary movingDictionary = new MovingDictionary(text);

        assertThat(movingDictionary.startingWith('a').equals(ImmutableMap.of("a", 2, "ac", 2, "ab", 1)));
    }

    public static void assertThat(boolean condition) {
        if (!condition) {
            throw new AssertionError("Condition not met here");
        }
    }
}
