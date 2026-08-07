class Solution {
    public int maxProduct(int n) {
        int rem=0;
        int max1=0;
        int max2=0;//since product of same number is applicable
        while( n>0)
        {
            rem=n%10;//last digit
            n=n/10;//quotient remaining digits
            if(rem>max1)
            {   max2=max1;//max2 should be value of max 1 before assigning rem cause it is 2nd largest number
                max1=rem;//rem assigning to ,max1
            }
            else if(rem>max2)//what if rem is lesser than max1 but greater than max2
            {
                  max2=rem;
            }

        }
        int product=max1*max2;
        return product;
    }
}