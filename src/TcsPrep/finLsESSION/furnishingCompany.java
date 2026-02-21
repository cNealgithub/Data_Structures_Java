package TcsPrep.finLsESSION;

import java.util.Scanner;

public class furnishingCompany {
    public static int findMaxAqua(String s, int l){

        int n = s.length();
        int max = 0;
        for(int i = 0; i < n; i+=l){
            int cnt = 0;
            for(int j = i; j < i+l && j < n; j++){
                if(s.charAt(j) == 'a'){
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = sc.nextInt();
        int ans = findMaxAqua(s,l);
        System.out.println(ans);
    }
}
