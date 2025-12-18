import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s1 = ip.next();
        String s2 = ip.next();

        if (s1.length() != s2.length()) {
            System.out.println("The Two Strings are not Anagrams");
        }
        else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("The Two Strings are Anagrams");
            }
            else {
                System.out.println("The Two Strings are not Anagrams");
            }
        }
    }
}
