public class Test{
    public static void main(String[] args){
        int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print((char)(64+j));
            }
            for(int j = i-1; j>= 1; j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}

#OUTPUT

A
ABA
ABCBA
ABCDCBA
