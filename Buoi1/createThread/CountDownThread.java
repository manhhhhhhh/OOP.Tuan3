package Buoi1.createThread;

public class CountDownThread  {
    public static void main(String[] args) {
         Thread contDownThread = new Thread(() -> {
             for (int i = 10; i > 0 ; i--){
                 System.out.println(i);
                 try {
                     Thread.sleep(1000);
                 }catch (InterruptedException e){
                     e.printStackTrace();
                 }
             }
         });
         contDownThread.start();
    }
}