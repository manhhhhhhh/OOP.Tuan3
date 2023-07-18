package Buoi1.createThread;

public class NumberGenerator extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Đối tượng được ưu tiên : " + hashCode() + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

