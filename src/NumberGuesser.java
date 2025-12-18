import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Think of a number between 0 and " + (n - 1));

        int result = findNumber(0, n - 1, sc);
        System.out.println("Your number is: " + result);
    }

    public static int findNumber(int low, int high, Scanner sc) {
        if (low == high) {
            return low;
        }
        int mid = low + (high - low) / 2;

        System.out.print("Is the number between " + low + " and " + mid );
        boolean isHere = sc.nextBoolean();

        if (isHere) {
            return findNumber(low, mid, sc);
        } else {
            return findNumber(mid + 1, high, sc);
        }
    }
}