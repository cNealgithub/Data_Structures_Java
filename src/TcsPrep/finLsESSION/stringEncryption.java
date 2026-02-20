package TcsPrep.finLsESSION;
import java.io.BufferedReader;
import java.util.*;

public class stringEncryption {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader()
        String s = sc.nextLine();
        int key = sc.nextInt();
        if(key<=0){
            System.out.println("Invalid input");
            return;
        }
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                char nChar = (char)(((ch-'A'+key) % 26 ) + 'A');
                 encrypted.append(nChar);
            }
            else if(ch>='a' && ch<='z'){
                char nChar = (char)(((ch-'a'+key) % 26 ) + 'a');
                encrypted.append(nChar);
            }
            else if(ch>='0' && ch<='9'){
                char nChar = (char)(((ch-'0'+key) % 10 ) + '0');
                encrypted.append(nChar);
            }
            else{
                encrypted.append(ch);
            }
        }
        System.out.println(encrypted);
    }
}
