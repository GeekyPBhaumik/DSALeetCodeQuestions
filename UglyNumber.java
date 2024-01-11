//1.ugly no. is a positive no. so, if n<=0, it will return false;
//2.if it is 6, then 2*3 , if 8 then 2*2*2
//3.if 125 then 5*5*5
//4.So in a while loop,keep on dividing by using if condition for 2,3 and 5 until n>1
// The provided code uses a while loop to repeatedly divide the number n by 2, 3, and 5 as long as n is divisible by any of these numbers. After the loop, it checks whether the remaining value of n is equal to 1. If so, the number is considered an ugly number; otherwise, it is not.

class Solution {
    public boolean isUgly(int n) {
        
        if(n<=0){
            return false;
        }
        else{
            while(n>1){
                if(n%2==0)
                   n=n/2;
                else if(n%3==0)
                   n=n/3;
                else if(n%5==0)
                   n=n/5;
                else
                   return false;         
            }
        }
    return true;
    }
}
