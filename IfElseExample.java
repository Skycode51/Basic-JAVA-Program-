package akash.learning;
import java.util.Scanner;
                           //IF-Else Statement //
public class IfElseExample {
    public static void main(String[] args) {
                int n;
        System.out.println("Enter Any Number: ");
        Scanner SC = new Scanner(System.in);
        n = SC.nextInt();
        if (n>=0)
        {
            System.out.println("+Ve Number");
        }
        else {
            System.out.println("-Ve Number");
        }
    }
}
