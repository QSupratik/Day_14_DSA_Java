import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many words? ");
        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);

        System.out.print("Search for: ");
        String target = sc.next();

        int low = 0;
        int high = words.length - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int compare = target.compareTo(words[mid]);

            if (compare == 0) {
                resultIndex = mid;
                break;
            }
            else if (compare > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("Found at index: " + resultIndex);
        } else {
            System.out.println("Not found.");
        }
    }
}