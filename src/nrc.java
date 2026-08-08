import java.util.Scanner;

 class nrc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        String city = sc.nextLine();

        System.out.println(name);
        System.out.println(roll);
        System.out.println(city);
    }
}