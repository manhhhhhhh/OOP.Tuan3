package Buoi1.createThread;

public class MainClass {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        numberGenerator1.setPriority(Thread.MAX_PRIORITY);
        numberGenerator2.setPriority(Thread.MIN_PRIORITY);
        numberGenerator1.start();
        numberGenerator2.start();
    }
}
