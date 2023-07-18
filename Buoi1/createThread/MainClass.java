package Buoi1.createThread;

public class MainClass {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator1);
        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
