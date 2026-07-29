public class palindrome {
    public static void main(String[] args){
    int n = sc.nextInt();
    int org=n;
    int rev=0;
    while(n>0){
        int d=n%10;
        rev=rev*10+d;
        n/=10;
    }
    if(rev==org) System.out.println("PALINDROME");
    else
        System.out.println("NOT PALINDROME");
}
