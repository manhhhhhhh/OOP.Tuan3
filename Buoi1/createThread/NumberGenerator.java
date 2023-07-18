package Buoi1.createThread;

public class NumberGenerator extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tên chủ đề đang chạy là  " + Thread.currentThread().getName());
            System.out.println("ưu tiên luồng đang chạy là " + Thread.currentThread().getPriority());
        }
    }
}

