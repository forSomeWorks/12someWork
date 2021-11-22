package ua.goit.task2;

public class Main {
    public static void main(String[] strings) {
        CustomThreadPoolExecutor customThreadPoolExecutor = new CustomThreadPoolExecutor(10);
        customThreadPoolExecutor.execute(new MyRunnable());
        customThreadPoolExecutor.shutdown();
    }
}
