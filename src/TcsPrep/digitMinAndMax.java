package TcsPrep;
import java.util.*;


public class digitMinAndMax {
    public static void minMax(int digit){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(digit != 0){
            int rem = digit % 10;
            max = Math.max(max, rem);
            min = Math.min(min, rem);
            digit/=10;
        }
        System.out.println(max+" "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        minMax(num);
    }
}
