import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n= sc.nextInt();
        int ele,temp;
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            ele = sc.nextInt();
            arr[i]=ele;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.err.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }
}
