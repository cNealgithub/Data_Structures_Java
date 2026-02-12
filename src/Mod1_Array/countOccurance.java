package Mod1_Array;

import java.util.Scanner;

public class countOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        System.out.println("array elements: ");
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        System.out.println(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag++;
            }
        }
        System.out.println("Occurance of " + target + " is : " + flag);
    }
}
