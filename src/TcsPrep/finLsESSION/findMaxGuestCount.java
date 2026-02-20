package TcsPrep.finLsESSION;
import java.util.*;

public class findMaxGuestCount {

    public static int maxGuest(int[] e, int[] l, int t1){
        int max = 0;
        int sum = 0;
        for(int i=0; i<t1; i++){
           sum += e[i] - l[i];
           max = Integer.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ge = new int[t];
        int[] gl = new int[t];
        System.out.println("Enter array elements for guest entering");
        for(int i=0; i<t; i++){
            ge[i] = sc.nextInt();
        }
        System.out.println("enter array elements for guest leaving");
        for(int i=0; i<t; i++){
            gl[i] = sc.nextInt();
        }
        int maxGuests = maxGuest(ge, gl, t);
        System.out.println(maxGuests);
    }
}
