package _1D_Array;
import java.util.Scanner;
public class Check_100_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (marks[i] == 100) {
                System.out.println("Congratulations! Student " + (i + 1) + " scored 100 marks.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student scored 100 marks.");
        }
    }
}