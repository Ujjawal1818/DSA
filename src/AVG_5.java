import java.util.Scanner;

class AVG_5
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, c, d, e;

        System.out.print("Enter a: ");
        a = sc.nextFloat();

        System.out.print("Enter b: ");
        b = sc.nextFloat();

        System.out.print("Enter c: ");
        c = sc.nextFloat();

        System.out.print("Enter d: ");
        d = sc.nextFloat();

        System.out.print("Enter e: ");
        e = sc.nextFloat();

        System.out.println("The Average of 5 numbers is " + (a + b + c + d + e) / 5);

        sc.close();
    }
}