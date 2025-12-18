public class Prime{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 1000 are ");
        for (int number = 0; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}