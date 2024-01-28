//https://leetcode.com/problems/count-asterisks/
import java.util.Scanner;

public class CountAsterisksEfficient {
    static int countAsterisk(String s) {
        //l|*e*et|c**o|*de|, l , *e*et , c**o , *de
        String strArr[] = s.split("\\|");
        int countAsterisks = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                for (char ch : strArr[i].toCharArray()) {
                    if (ch == '*') {
                        countAsterisks++;
                    }
                }
            }
        }
        return  countAsterisks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countAsterisk(s));
    }
}
