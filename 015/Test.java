public class Test{
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i<= n; i++){
            char ch = (char)(64+ i);
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

#Output

A
BB
CCC
DDDD
EEEEE
