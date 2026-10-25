class Solution {
    public int countDigits(int num) {
        int x = num;
        int cont = 0;
        while (x != 0){
            int y = x % 10;
            x /= 10;
            if (num % y == 0){
                cont++;
            }
        }
        return cont;
    }
    
}
