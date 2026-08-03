import java.util.Scanner;

class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.print(1);
            return;
        }

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        System.out.print(count);
    }
}