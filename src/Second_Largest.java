import java.util.*;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int largest =Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num>largest){
                largest = num;
            }
             if(num<smallest){
                 smallest =num;
             }
        }
        System.out.println("Largest Element: "+ largest);
        System.out.println("Smallest Element: "+ smallest);
    }
}