import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        // Create a HashMap to store Roman numerals and their integer values
        HashMap<Character, Integer> map = new HashMap<>();

        // Store all Roman numeral values
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0; // Stores the final integer value
        int prev = 0;  // Stores the previous (right-side) Roman numeral value

        // Traverse the string from right to left
        // Because in Roman numerals, a smaller value before a larger value means subtract.
        for (int i = s.length() - 1; i >= 0; i--) {

            // Get the integer value of the current Roman numeral
            int curr = map.get(s.charAt(i));

            // If the current value is smaller than the previous value,
            // subtract it (Example: IV, IX, XL, XC, CD, CM)
            if (curr < prev) {
                total -= curr;
            }
            // Otherwise, add the current value
            else {
                total += curr;
            }

            // Update previous value for the next iteration
            prev = curr;
        }

        // Return the final integer
        return total;
    }
}