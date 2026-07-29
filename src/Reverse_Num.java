public class Reverse_Num {
     public static void main(String[] args){
         int n=sc.nextInt();
         int rev=0;
         while(n>0){
             int d=n%10;
          rev=rev*10+d;
         }

     }
}
