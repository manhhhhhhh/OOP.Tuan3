package Buoi1.primeNumber;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        if(number < 2){
            return false;
        }
        int squareRoot = (int)Math.sqrt(number) ;
        for (int i = 2; i <= squareRoot ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

