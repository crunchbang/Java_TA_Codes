import java.util.Scanner;

public class IterativeSumFor {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = s.nextInt();
                System.out.println("Sum of the sequence: " + iterativeSumFor(n));

        }

        public static int iterativeSumFor(int n) {
                int sum = 0;
                for (int i = 1; i <= n; ++i) {
                        sum += i;
                }
                return sum;
        }
}
