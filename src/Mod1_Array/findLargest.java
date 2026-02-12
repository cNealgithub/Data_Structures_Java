package Mod1_Array;

import java.util.Scanner;

public class findLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //assuming first element is largest
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element: "+largest);
    }
}
