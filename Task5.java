import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Task5 {

    public static int generateRandomPrime(int min, int max) {
    Random rand = new Random();
    List<Integer> primeList = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        if (primeList.isEmpty()) {
            throw new IllegalArgumentException("No prime numbers in the given range.");
        }

        int randomIndex = rand.nextInt(primeList.size());
        return primeList.get(randomIndex);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int randomPrime = generateRandomPrime(min, max);
        System.out.println("Random Prime between " + min + " and " + max + ": " + randomPrime);
    }
}

