package Mod1_Array;



import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("array : " );
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        int j = arr.length-1;
        int i = 0;
        while( i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed array : ");
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
