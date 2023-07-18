package Buoi1.thucHanh;

public class Terminated extends  Thread{
    public static void main(String[] args) {
        Terminated terminated = new Terminated();
        terminated.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
