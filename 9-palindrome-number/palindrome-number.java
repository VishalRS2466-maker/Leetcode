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

            // Take the last digit of temp and add it to rev
            rev = (rev * 10) + (temp % 10);

            // Remove the last digit from temp after adding it with rev
            temp = temp / 10;
        }

        return (num == rev);
    }
}