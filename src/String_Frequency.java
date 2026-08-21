import java.util.*;
public class String_Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
                for(int i=0;i<s.length();i++){
                    int in=s.indexOf(s.charAt(i));
                    if(in<i) continue;
                    int c=0;
                    for(int j=0;j<s.length();j++){
                        if(s.charAt(j)==s.charAt(i))c++;
                    }
                    System.out.println(s.charAt(i)+" occurs "+c+" times");
                }
    }
}
