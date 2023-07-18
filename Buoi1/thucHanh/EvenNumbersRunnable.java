package Buoi1.thucHanh;

class EvenNumbersRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        EvenNumbersRunnable evenRunnable = new EvenNumbersRunnable();
        Thread thread = new Thread(evenRunnable);
        thread.start();
    }
}