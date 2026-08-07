package _1D_Array;

import java.util.Scanner;

public class Min_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.print("Marks: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        int min = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        System.out.println("Lowest Marks: " + min);
    }
}