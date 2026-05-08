package Arrays;

import java.util.Scanner;

public class Inputprint {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size of an array ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
