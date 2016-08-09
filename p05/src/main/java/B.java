import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

public class B {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException, BrokenBarrierException {
        final ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Got value " + exchanger.exchange("Hello") + " from other T2");
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Got value " + exchanger.exchange("World") + " from other T1");
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
