package Mod1_Array;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int val:arr){
            System.out.print(val+" ");
        }
        //addition module
        int sum = 0;
        for(int val:arr){
            sum += val;
        }
        System.out.println(" ");
        System.out.println("Sum of elements :" + sum);
    }
}
