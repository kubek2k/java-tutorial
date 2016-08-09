import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiThreadCollection {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        final Random random = new Random();
//        final Stream<Integer> ints = Stream.generate(random::nextInt);
//
        ForkJoinPool pool = new ForkJoinPool(4);
        final ForkJoinTask<String> task = pool.submit(new RecursiveTask<String>() {
            @Override
            protected String compute() {
                final ForkJoinTask<String> task = new RecursiveTask<String>() {
                    @Override
                    protected String compute() {
                        return "abcd";
                    }
                };
                task.fork();

                Random rand = new Random();
                final Stream<Integer> ints = Stream.generate(rand::nextInt);
                String s = ints
                        .limit(10)
                        .map(Object::toString)
                        .collect(Collectors.joining(","));

                return s + task.join();
            }
        });
        System.out.println(task.join());

//        System.out.println(pool.submit(() -> {
//            return ints
//                    .parallel()
//                    .limit(100_000)
//                    .filter(i -> i % 5 == 0)
//                    .peek(i -> System.out.println(Thread.currentThread().getName() + " " + i))
//                    .count();
//        }).get());
    }
}
