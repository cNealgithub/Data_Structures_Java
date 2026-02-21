package TcsPrep.finLsESSION;

import java.util.Scanner;

public class Amstrong {
    public static int digitCount(int num){
        int cnt = 0;
        while(num > 0){
            num /= 10;
            cnt++;
        }
        return cnt;
    }

    public static boolean isAmstrong(int num){
        int n = num;
        int power = digitCount(num);
        int sum = 0;
        while(n != 0){
            int lastdigi = n%10;
            n/=10;
            sum += (Math.pow(lastdigi, power));
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean amstrong = isAmstrong(n);
        if(amstrong){
            System.out.println("Is a amstrong number");
        }else{
            System.out.println("is not an amstrong number");
        }
    }
}
