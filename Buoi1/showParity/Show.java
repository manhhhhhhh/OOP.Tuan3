package Buoi1.showParity;

public class Show {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        evenThread.start();
        try {
            evenThread.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        oddThread.start();
    }
}
