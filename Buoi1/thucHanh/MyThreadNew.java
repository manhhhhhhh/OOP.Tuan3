package Buoi1.thucHanh;

public class MyThreadNew extends Thread {
    @Override
    public void run(){
        System.out.println("Thread Start");
    }

    public static void main(String[] args) {
        MyThreadNew myThread = new MyThreadNew();
        System.out.println(myThread.getState());
    }

}
