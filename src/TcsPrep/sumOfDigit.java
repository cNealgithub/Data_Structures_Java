package TcsPrep;
import java.util.*;

public class sumOfDigit {
    public static int digiSum(int digit){
        int sum = 0;
        while(digit != 0){
            int rem = digit % 10;
            sum+=rem;
            digit/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = digiSum(num);
        System.out.println("Sum: " + result );
    }
}
