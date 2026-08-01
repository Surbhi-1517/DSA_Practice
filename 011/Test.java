
public class Test {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Left side
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

#Output

  1      1
  12    21
  123  321
  12344321
}
