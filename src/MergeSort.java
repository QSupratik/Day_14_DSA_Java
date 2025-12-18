import java.util.Scanner;

public class MergeSort {
    public static void merge(String[] list, int start, int mid, int end) {
        int start2 = mid + 1;
        if (list[mid].compareTo(list[start2]) <= 0) {
            return;
        }
        while (start <= mid && start2 <= end) {
            if (list[start].compareTo(list[start2]) <= 0) {
                start++;
            }
            else {
                String value = list[start2];
                int index = start2;
                while (index != start) {
                    list[index] = list[index - 1];
                    index--;
                }
                list[start] = value;
                start++;
                mid++;
                start2++;
            }
        }
    }

    public static void mergeSort(String[] list, int start, int end) {
        if (start >= end) return;

        int mid = (end - start) / 2 + start;
        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);

        merge(list, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n = ip.nextInt();
        String[] list = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            list[i] = ip.next();
        }
        mergeSort(list, 0, list.length - 1);
        for (String val : list) {
            System.out.print(val + " ");
        }
    }
}