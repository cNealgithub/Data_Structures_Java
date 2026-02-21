package TcsPrep.finLsESSION;

import java.util.Scanner;

public class GreatesrCommonDivisor {

    public static int findGcd(int n1, int n2){
        int gcd = 0;
        int range = Math.min(n1, n2);

        for(int i = 1; i <= range; i++){
            if(n1 % i  == 0 && n2 % i == 0){
               gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = findGcd(n1, n2);
        System.out.println(ans);
    }
}
