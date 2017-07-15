import java.util.Scanner; //for taking input

public class Dbl {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in); //Scanner class is used to take input from the user
                // can be omitted if you're hardcoding the input
                System.out.print("Enter a number: ");
                int n = s.nextInt();
                System.out.println("Doubled output: " + dbl(n));

        }

        public static int dbl(int n) {
                return 2*n;
        }
}
