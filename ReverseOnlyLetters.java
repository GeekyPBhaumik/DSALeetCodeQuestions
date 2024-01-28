//https://leetcode.com/problems/reverse-only-letters/
import java.util.Scanner;

public class ReverseOnlyLetters {
    static String reverseLetters(String s){
        char strArr[] = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(Character.isLetter(strArr[i])){
                if(Character.isLetter(strArr[j])){
                    char temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return String.valueOf(strArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(reverseLetters(s));
    }
}
