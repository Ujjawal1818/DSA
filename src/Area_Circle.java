import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("enter r");
        r = sc.nextFloat();
        System.out.printf("The Area Of Circle is %.3f", 3.14 * r * r);
    }
}