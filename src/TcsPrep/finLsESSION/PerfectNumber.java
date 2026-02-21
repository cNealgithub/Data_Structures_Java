package TcsPrep.finLsESSION;
import java.util.*;

public class PerfectNumber {

    public static boolean isPrfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if( sum == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrfect(n));
    }
}
