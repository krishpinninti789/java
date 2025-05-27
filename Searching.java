
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n= sc.nextInt();
        int ele;
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            ele = sc.nextInt();
            arr[i]=ele;
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println("elements");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
            
        // }
        // System.out.println();
        System.out.print("Enter element to search in array: ");
        int se = sc.nextInt();
        int flag = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==se){
                flag = 1;
                break;
            }


        }
        if(flag == 1)
        System.out.println("Element found");
        else
        System.err.println("Element not found");
    }
}
