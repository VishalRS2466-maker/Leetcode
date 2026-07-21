class Solution {
    public String reverseWords(String s) {
        int n = s.length(); // n is legth so 15 but i is index so n-1
        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            
            if (s.charAt(i) == ' ') {
                continue;
            }

            StringBuilder word = new StringBuilder();

            while (i >= 0 && s.charAt(i) != ' ') // to separate the word
            {
                word.insert(0, s.charAt(i)); // e // ue // lue // blue // to store like this directly
                i--; // decrement
            }

            ans.append(" ").append(word); // to add word in the answer
        }

        return ans.substring(1); // " sky is blue" to remove that extra space at 0th poition return from 1st position
    }
}