package akash.learning;
                // Nested For loop Example //
public class NestedForLoop {
    public static void main(String[] args) {
        int i,j;

        for ( i = 1; i <=5; i++)  // Row
        {
            for ( j = 1; j <=5 ; j++) //Colunm
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
