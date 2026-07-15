class Solution {
    public int[] plusOne(int[] digits) {
    int n=digits.length-1;//length of the arry
        for(int i=n;i>=0;i--)
        {
        if (digits[i]<9)
        {
            digits[i]++;//increasing digits by 1
            return digits;
        }
         digits[i]=0;//if digits[i]=9
        }
        //if all theelements are 9 for ex digits={9,9}
         int newdigits[]=new int[digits.length+1];//or int[n+2]
         newdigits[0]=1;//if {9,9,9} then 0/p={1,0,0,0}
         return newdigits;
        //Coded by Vishal R S 

    }
}