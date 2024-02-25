package akash.learning;

import java.util.Scanner;

// Print Character
public class CharacterPrint
{
    public static void main(String[] args) {
        char ch;
        System.out.print("Please Enter Character ");
        Scanner SC= new Scanner(System.in);
        //for Scanner String Method Print mate
        //Why Zero only Print 1 Char (A) A-Kash
        // Ii you print 1 Char(a-K-ash)
        ch = SC.next().charAt(0);
        System.out.println(ch);
    }
}
