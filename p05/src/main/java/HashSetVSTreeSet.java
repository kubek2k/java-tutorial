import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetVSTreeSet {

    private static void time(Runnable r) {
        long start = new Date().getTime();
        try {
            r.run();
        } finally {
            long end = new Date().getTime();
            System.out.println("Time taken: " + (end - start));
        }
    }

    private static List<Integer> between(Integer start, Integer end) {
        return null;
    }

    public static void main(String[] args) {
        final Set<Integer> s1 = new HashSet<Integer>();
        time(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++ ) {
                    s1.add(3*i);
                }
                for (int i = 0; i < 10000; i++) {
                    s1.contains(2*i);
                }
            }
        });

//        time(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 10000; i++ ) {
//                    s1.add(3*i);
//                }
//                if (between(5000, 500))
//            }
//        });


    }

}
