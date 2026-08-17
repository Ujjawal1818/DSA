import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        long fact = 1;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}