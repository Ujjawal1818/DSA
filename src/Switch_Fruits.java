import java.util.*;
public class Switch_Fruits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit=sc.nextLine();
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Keeps the doctor away");
                break;
            case "Orange":
                System.out.println("Rich in Vitamin C");
                break;
            case "Banana":
                System.out.println("For quick energy");
            default:
                System.out.println("Please input a valid fruit");
        }
    }
}
