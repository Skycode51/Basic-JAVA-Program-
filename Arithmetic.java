package akash.learning;
import java.util.Scanner;
                                  // Arithmetic Operator Examples \\
public class Arithmetic {
    public static void main(String[] args)
    {
        int a,b;                                                              //input
        System.out.print("Enter two number..: " );
        Scanner SC = new Scanner(System.in);       // Predefined input
        a = SC.nextInt();  // predefined method of Scanner input to call
        b = SC.nextInt();

        System.out.println("Addition "+(a+b));                                 //output
        System.out.println("Subtraction  "+(a-b));
        System.out.println("Multiplication  "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Remainder "+(a%b));
    }
}
