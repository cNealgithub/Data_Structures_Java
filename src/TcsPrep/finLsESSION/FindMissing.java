package TcsPrep.finLsESSION;

import java.util.Scanner;

public class FindMissing {
    public static int findMissing(int[] num, int n){
        int acSum = (n*(n + 1))/2;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += num[i];
        }
        return acSum - sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i<n;i++){
            num[i] = sc.nextInt();
        }
        int ans = findMissing(num, n);
        System.out.println(ans);
    }
}
