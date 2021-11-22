package ua.goit.task2;

@Repeat(count = 5)
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
