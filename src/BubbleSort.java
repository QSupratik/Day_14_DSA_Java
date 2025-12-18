import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter the 10 array elements");
        for(int i=0;i<10;i++){
            list[i]=ip.nextInt();
        }
        bubbleSort(list);
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}