package Buoi1.guessTheNumberThread;

import java.util.Scanner;

public class guessTheNumber extends Thread {
    private int guessNumber = 0;
    private int count = 0;

    public guessTheNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 20 + 1);
            count ++;
            System.out.println(getName() + " Đoán số " + randomNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }while (randomNumber != guessNumber);
        System.out.println(getName() + " đã đoán ra số " + guessNumber + " trong " + count + " lần đếm ");
    }
}
class showNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để các người chơi đoán : ");
        int number = scanner.nextInt();
        guessTheNumber thread = new guessTheNumber(number);
        guessTheNumber thread1 = new guessTheNumber(number);

        thread.setName("Người Chơi 1 : ");
        thread1.setName("Người Chơi 2 : ");

        thread.start();
        thread1.start();
    }
}
