import java.util.Arrays;
import java.util.ArrayList;

public class PrimeExtended {
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        int start = 0;
        int end = 1000;

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                primeList.add(number);
            }
        }

        System.out.println("Prime Palindromes");
        for (int prime : primeList) {
            if (isPalindrome(prime)) {
                System.out.print(prime + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Prime Anagram Pairs");
        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i + 1; j < primeList.size(); j++) {
                if (isAnagram(primeList.get(i), primeList.get(j))) {
                    System.out.println(primeList.get(i) + " " + primeList.get(j));
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return original == reverse;
    }

    public static boolean isAnagram(int num1, int num2) {
        char[] s1 = String.valueOf(num1).toCharArray();
        char[] s2 = String.valueOf(num2).toCharArray();
        if (s1.length != s2.length) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}