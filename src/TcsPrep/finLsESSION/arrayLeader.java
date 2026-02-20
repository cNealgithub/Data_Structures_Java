package TcsPrep.finLsESSION;
import java.util.*;

public class arrayLeader {

    public static ArrayList<Integer>leaders(int[] num){
        int n = num.length;
        int rMax = num[n-1];
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(num[n-1]);
        for(int i = num.length-2; i >= 0; i--){
            if(num[i] > rMax){
                ans.add(num[i]);
                rMax = num[i];
            }
        }
        //for end
        //reverse the arraylist
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        //forends
        ArrayList<Integer>ans = leaders(nums);
        ans.reversed();
        for(int i : ans) {
            System.out.print(i+" ");
        }
    }
}
