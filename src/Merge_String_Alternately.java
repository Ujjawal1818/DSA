import java.util.Scanner;
public class Merge_String_Alternately{
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String ans = "";
        while (i < word1.length() && j < word2.length()) {
            ans = ans + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }
        while (i < word1.length()) {
            ans += word1.charAt(i++);
        }
        while (j < word2.length()) {
            ans += word2.charAt(j++);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }
}