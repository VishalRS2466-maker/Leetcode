class Solution {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) 
          //Only need to check positions where the complete
        // needle can fit inside haystack.
        {

            if (haystack.charAt(i) == needle.charAt(0)) {

               // Get a substring of haystack with the same length as needle
                if (haystack.substring(i, i + needle.length()).equals(needle))
                {


                    return i;// Return the first matching index

                }
            }
        }

        return -1;// if needle is not found
    }
}