package akash.learning;
import java.util.Scanner;
                       /* Relational Operator Example..! */
public class RelationalOperator
{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the Two Numbers: ");
        Scanner SC = new Scanner(System.in);  // User through input //Object
        a=SC.nextInt();     //Predefined Input in Scanner  //To call the value
        b= SC.nextInt();

        System.out.println("true/false "+(a<b));
        System.out.println("true/false "+(a>b));
        System.out.println("true/false "+(a<=b));
        System.out.println("true/false "+(a>=b));
        System.out.println("true/false "+(a==b));
        System.out.println("true/false "+(a!=b));
    }
}
