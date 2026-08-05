package _1D_Array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        // marks => 50,99,98,60,40
        int[] marks = {50, 99, 98, 60, 40};
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
        }
    }
}
