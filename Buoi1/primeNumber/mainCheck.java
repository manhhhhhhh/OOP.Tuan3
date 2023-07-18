package Buoi1.primeNumber;

public class mainCheck {
    public static void main(String[] args) {
        LazyPrimeFactorization prime = new LazyPrimeFactorization();
        OptimizedPrimeFactorization primeObj = new OptimizedPrimeFactorization();
        Thread thread = new Thread(prime);
        Thread thread1 = new Thread(primeObj);
        thread.start();
        thread1.start();

    }
}
