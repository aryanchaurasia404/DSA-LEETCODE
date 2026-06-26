class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        // Reverse the number
        while (x > 0) {

            int digit = x % 10;              // Last digit

            reverse = reverse * 10 + digit;  // Build reverse number

            x = x / 10;                      // Remove last digit
        }

        // Compare original and reversed number
        return original == reverse;
    }
}