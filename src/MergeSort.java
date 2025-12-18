import java.util.Scanner;

public class MergeSort {
    public static void merge(int start, int mid, int end){
        int start2=mid+1;
        while(start<=mid && start2<=end){

        }
    }

    public static void mergeSort(String[] list, int start, int end){
        //Base Case
        if(start>=end) return;

        int mid = (end-start)/2 + start;
        mergeSort(list, start, mid);
        mergeSort(list, mid+1, end);

        merge(start, mid, end);
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n = ip.nextInt();
        String[] list = new String[n];
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++){
            list[i]=ip.next();
        }
        mergeSort(list, 0, list.length-1);
        for (String val : list) {
            System.out.print(val + " ");
        }
    }
}
