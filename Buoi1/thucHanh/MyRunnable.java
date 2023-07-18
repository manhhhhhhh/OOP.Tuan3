package Buoi1.thucHanh;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunn");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Buoi1.MyRunnable End");
    }
}
class MyThreadWaiting extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread Start");
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        try {
            myRunnableThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("MyThread End");
    }
}
class main{
    public static void main(String[] args) {
        MyThreadWaiting myThreadWaiting = new MyThreadWaiting();
        myThreadWaiting.start();
        try {
            Thread.sleep(100);
            System.out.println("MyThread State " + myThreadWaiting.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
