import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(String[] list){
        for(int i=1;i< list.length;i++){
            String temp = list[i];
            int j=i-1;
            while(j>=0 && temp.compareTo(list[j])<0){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=temp;
        }
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
        insertionSort(list);
        for (String val : list) {
            System.out.print(val + " ");
        }
    }
}
