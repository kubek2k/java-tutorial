import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class ForkJoin {

    private static class Task extends RecursiveTask<String> {

        private static final int LOCAL_LEN = 100;

        private final Integer[] ints;
        private final int from;
        private int length;

        public Task(final Integer[] ints, final int from, int length) {
            this.ints = ints;
            this.from = from;
            this.length = length;
        }

        @Override
        protected String compute() {
            if(this.length > LOCAL_LEN) {
                final Collection<Task> coll = invokeAll(asList(
                        new Task(ints, this.from, this.length / 2),
                        new Task(ints, this.from + (this.length/2), this.length / 2)));

                return coll
                        .stream()
                        .map(t -> {
                            try {
                                return t.get();
                            }
                            catch(Exception e) {
                                throw new RuntimeException(e);
                            }
                        })
                        .collect(Collectors.joining(","));
            }

            final StringBuilder b = new StringBuilder();
            for (int i = this.from; i < this.from + length - 1; i++) {
                b.append(this.ints[i]);
                b.append(",");
            }
            b.append(this.ints[this.from + length - 1]);
            return b.toString();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ForkJoinPool pool = new ForkJoinPool();
        final Random random = new Random();
        Integer[] arr = new Integer[1024];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        final ForkJoinTask<String> task = pool.submit(new Task(arr, 0, arr.length));
        System.out.println(task.get());
    }

}
