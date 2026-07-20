class Solution {
    public boolean isPalindrome(int num) {

        // Negative numbers cannot be palindrome
        if (num < 0) {
            return false;
        }

        // Store the original number
        int temp = num;
        int rev = 0;

        // Reverse the number
        while (temp != 0) {
            int digit=temp%10; //gives the last digit
            
            rev = (rev * 10) +digit ; // Take the last digit of temp and add it to rev

            temp = temp / 10;
            // Remove the last digit from temp after adding it with rev
        }

        return (num == rev);
    }
}