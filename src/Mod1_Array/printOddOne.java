package Mod1_Array;

import java.util.Scanner;

public class printOddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = sc.nextInt();
        int[] nums = new int[size];;
        boolean oddPresent = false;
        boolean evenSize = false;
        if (size % 2 == 0) {
            evenSize = true;
            System.out.println("Enter elements : ");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
        } else {
            System.out.println(0 + "pls enter even value for size");
        }
        for (int i : nums){
            if(i % 2 != 0){
                System.out.println(i);
                oddPresent = true;
                break;
            }
        }
        if(evenSize && !oddPresent){
            System.out.println("all elements are even");
        }
    }
}
