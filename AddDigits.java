//https://leetcode.com/problems/add-digits/
class Solution {
    public int addDigits(int num) {
    //1.checking if num is less than 10 then just return it
    //2.if it is not less than 10 then loop it and add it's digits until num=0
    //3.then just assign the sum value to num
    //Repeat Step 1

    //Suppose num = 199
    while(num>=10){
      int currSum=0;
      while(num>0){
          currSum=currSum+num%10;
          num=num/10;
      }
      //now at the end of this loop
      //num = 0, currSum = 19
      //So, we need to assign the value of currSum to num to satisfy
      //the above first while loop
      //so
      //again num = 19
      //again at the end of second while loop
      //num = 0, currSum = 10
      //again num = 10
      //again at the end of second while loop
      //num = 0, currSum = 1
      //again num will be 1
      //so now as num is less than 10 , it will move out of first while loop and the
      //output will be 1
      num = currSum;  
    }
    return num;
    }
}
