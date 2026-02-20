package TcsPrep.finLsESSION;
import java.util.*;

public class zeroAllocation {

    public static void zeroToRight(int[] arr){
        int n = arr.length;
        int j = -1;
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if( j == -1){
            return;
        }
        for(int i = j+1; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        zeroToRight(nums);
    }
}
