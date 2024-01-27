import java.util.Scanner;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {

    //rotatxor
    //r    r
    //o    o
    //t    x
    //then we can either delete t or x
    //So, remove t and check if the string from start+1 to end is palindrome or i.e. atx
    //remove x and check if the string from start to end-1 is palindrome or not i.e. tat
    static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){  // rotatxor
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return (isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1));
            }
        }
        return true;
    }
    //using helper method
    static boolean isPalindrome(String s, int start, int end){

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if(validPalindrome(s)){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
    }
}
