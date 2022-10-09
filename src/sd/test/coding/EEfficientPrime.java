package sd.test.coding;

public class EEfficientPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(49));
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
