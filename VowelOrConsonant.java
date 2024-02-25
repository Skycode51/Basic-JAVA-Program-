package akash.learning;
import java.util.Scanner;
/* Vowel or Consonant in Java */
// input a e i o u ---> Vowel
// input b c d f g etc... --> Consonant
public class VowelOrConsonant {
     public static void main(String[] args) {

        char ch;
         System.out.print("Enter any Character: ");
         Scanner SC = new Scanner(System.in);
         ch = SC.next().charAt(0);

         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             System.out.println("Vowel");
         }
         else
         {
             System.out.println("Consonant");
         }

     }
}
