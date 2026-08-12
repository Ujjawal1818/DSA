import java.util.Scanner;
  class String2 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();

          int v = 0;
          int c = 0;

          // code here
          for (int i = 0; i < s.length(); i++) {
              char ch = s.charAt(i);

              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                  v++;
              } else {
                  c++;
              }
          }

          if (v > c) System.out.println("Yes");
          else if (v < c) System.out.println("No");
          else System.out.println("Same");
      }
  }
