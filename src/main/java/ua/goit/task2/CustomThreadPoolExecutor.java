package ua.goit.task2;

import java.util.concurrent.*;

public class CustomThreadPoolExecutor extends ThreadPoolExecutor {

    public CustomThreadPoolExecutor(int numThreads) {
        super(numThreads, numThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    }

    public void execute(Runnable command) {
        int countAnnotations = command.getClass().getAnnotation(Repeat.class).count();
        while (countAnnotations-- > 0) {
            super.execute(command);
        }
    }
}
