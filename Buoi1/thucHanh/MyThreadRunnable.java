package Buoi1.thucHanh;

public class MyThreadRunnable  extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Start");
    }

    public static void main(String[] args) {
        MyThreadRunnable runnable = new MyThreadRunnable();
        runnable.start();
        System.out.println(runnable.getState());
    }
}
