class Solution {
    public boolean isPalindrome(String word){
        int tam = word.length();
        boolean val = true;
        for (int i = 0; i<tam; i++){
            if (word.charAt(i) != word.charAt(tam - 1 - i)) val = false;
        }
        return val;
    }
    public String firstPalindrome(String[] words) {
        for (String x: words){
            if (isPalindrome(x)) return x;
        }
       return "";
    }
}
