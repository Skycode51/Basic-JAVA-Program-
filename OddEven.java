package akash.learning;
import java.util.Scanner;
                     // Odd Even Number Example //
public class OddEven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Scanner SC = new Scanner(System.in);
        n=SC.nextInt();

        if( n%2==0)
        {
            System.out.println("Even Number..!");
        }
        else
        {
            System.out.println("Odd Number...!");
        }
    }
}
