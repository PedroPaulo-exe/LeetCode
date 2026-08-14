class Solution {
    public int firstUniqChar(String s) {
        // Verify every character
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;

            // Compare the char with the others chars like an insrtion sort
            for (int j = 0; j < s.length(); j++) {
                // if the there is another letter and the index are diffence so isUnique is false;
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    isUnique = false;
                    break; // Stop checking this character, it's not unique!
                }
            }

            //If isUnique is true, because don't have any samme letter they you print
            if (isUnique) {
                return i;
            }
        }

        // If for some reason we find nothing will return -1
        return -1;
    }
}
