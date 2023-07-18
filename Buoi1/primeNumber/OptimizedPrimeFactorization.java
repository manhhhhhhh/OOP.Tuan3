package Buoi1.primeNumber;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (PrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean PrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
