import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    int cores = Runtime.getRuntime().availableProcessors();
    int parallelism = java.util.concurrent.ForkJoinPool.getCommonPoolParallelism();

    System.out.println("Runtime.getRuntime.availableProcessors() = " + cores);
    System.out.println("java.util.concurrent.ForkJoinPool.getCommonPoolParallelism() = " + parallelism);

    List<Integer> nums = new ArrayList<>();
    for (Integer i = 1; i < 1000; i++) {
      nums.add(i);
    }

    System.out.println("Now checking if we really have " + cores + " core(s)...");
    Thread.sleep(5000L);

    nums.parallelStream().forEach(n -> System.out.println(Thread.currentThread().getName() + ": " + n));
  }
}
