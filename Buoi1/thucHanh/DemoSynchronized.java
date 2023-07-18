package Buoi1.thucHanh;

public class DemoSynchronized {
    public static synchronized void commonResource(){
        for (int i = 0; i < 10000; i++) {

        }
    }
}
class MyThreadBlocked extends Thread{
    @Override
    public void run(){
        DemoSynchronized.commonResource();
    }
}
class MainClass{
    public static void main(String[] args) {
        MyThreadBlocked blocked = new MyThreadBlocked();
        MyThreadBlocked blocked1 = new MyThreadBlocked();
        MyThreadBlocked blocked2 = new MyThreadBlocked();
        blocked.start();
        blocked1.start();
        blocked2.start();

        System.out.println(blocked.getName() + ": " + blocked.getState());
        System.out.println(blocked1.getName() + ": " + blocked1.getState());
        System.out.println(blocked2.getName() + ": " + blocked2.getState());
    }
}