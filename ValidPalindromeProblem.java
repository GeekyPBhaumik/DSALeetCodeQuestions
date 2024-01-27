import java.util.Scanner;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindromeProblem {

    static boolean isValidPalin(String s){
        //it replaces all non-alphanumneric characters with "" that means 
        // even if there is a space it will remove the space
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isValidPalin(s))
           System.out.println("Valid Palindrome");
        else
            System.out.println("Invalid Palindrome");
    }
}
