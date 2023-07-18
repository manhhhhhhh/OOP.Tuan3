package Buoi1.guessTheNumberRunnable;

import java.util.Scanner;

public class guessAllNumber implements Runnable{
        private int guessNumber = 0;
        private int count = 0;

        public guessAllNumber (int guessNumber){
            this.guessNumber = guessNumber;
        }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random()  * 20 + 1);
            count ++;
            System.out.println(Thread.currentThread().getName() + " đoán số " + randomNumber);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        } while (randomNumber != guessNumber);
        System.out.println(Thread.currentThread().getName() + " đã đoán số " + guessNumber + " trong " + count + " lần đếm ");
    }
}
class MainNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để người chơi đoán : ");
        int number = scanner.nextInt();

        guessAllNumber runnable = new guessAllNumber(number);
        guessAllNumber runnable1 = new guessAllNumber(number);
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.setName("Người chơi 1 : ");
        thread1.setName("Người chơi 2 : ");

        thread.start();
        thread1.start();
    }
}