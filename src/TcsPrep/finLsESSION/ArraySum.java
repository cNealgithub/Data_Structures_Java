package TcsPrep.finLsESSION;
import java.util.*;

public class ArraySum {

    public static int integerCount(int[] arr, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if( k >= 1 && k <= 100) {
            int[] integers = new int[k];
            for (int i = 0; i < k; i++) {
                integers[i] = sc.nextInt();
            }
            int result = integerCount(integers, k);
            System.out.println(result);
        }else{
            System.out.println("Invalid input");
        }
    }
}
