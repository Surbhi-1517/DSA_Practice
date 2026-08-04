public class Test{
    public static void main(String[] args){
         int n = 5;

         for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = n-i+1; j <= n; j++){
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
         }
    }
}

#Output

        E 
      D E 
    C D E 
  B C D E 
A B C D E 
