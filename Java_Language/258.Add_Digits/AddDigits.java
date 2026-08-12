class Solution {
    public int soma(int num){
        int tot = 0;
        while(num != 0){
            tot += num % 10;
            num /= 10;
        }
        return tot;
    }
    public int tam(int num){
        int tamanho = 0;
        while (num != 0){
            num /= 10;
            tamanho++;
        }
        return tamanho;
    }
    public int addDigits(int num) {
        int val = tam(num);
        for (int i =0; i<val; i++){
            num = soma(num);
        }
        return num;
    }
}
