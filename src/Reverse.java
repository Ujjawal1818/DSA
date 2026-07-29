import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;      // Gets the last digit
            rev = rev * 10 + d;  // Builds the reversed number
            n = n / 10;          // Removes the last digit
        }
        if (org == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}