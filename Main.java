public class Main {
  public static void main(String[] args) {
    System.out.println("Runtime.getRuntime.availableProcessors() = " + Runtime.getRuntime().availableProcessors());
    System.out.println("java.util.concurrent.ForkJoinPool.getCommonPoolParallelism() = " + java.util.concurrent.ForkJoinPool.getCommonPoolParallelism());
  }
}
