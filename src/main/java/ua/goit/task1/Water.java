package ua.goit.task1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Water {
    private final CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
    private final Semaphore hydrogen = new Semaphore(2);
    private final Semaphore oxygen = new Semaphore(1);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException, BrokenBarrierException {
        hydrogen.acquire();
        releaseHydrogen.run();
        cyclicBarrier.await();
        hydrogen.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException, BrokenBarrierException {
        oxygen.acquire();
        releaseOxygen.run();
        cyclicBarrier.await();
        oxygen.release();
    }
}
