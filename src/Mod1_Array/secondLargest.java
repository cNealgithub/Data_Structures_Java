package Mod1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {

    public static int secondLargElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest element found");
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter rray elements: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int resElement = secondLargElement(nums);
        System.out.println("second largest element: " + resElement);
    }
}
