package akash.learning;
import java.util.Scanner;
/* Print ASCII Value of character */
 // input A---> 65
public class ASCIIValueCharacter
{
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any Character: ");
        Scanner SC = new Scanner(System.in);
        ch = SC.next().charAt(0);

        int a=ch; //Implicit Casting // 65 = A
        System.out.println("ASCII Valur of " +ch+" is " + a);
    }
}
