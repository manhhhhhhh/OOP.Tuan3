package Buoi1.thucHanh;

class CountdownThread extends Thread{
    @Override
    public void run(){
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread();
        countdownThread.start();
    }
}