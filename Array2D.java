package akash.learning;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        // Array in Matrix form
        // input
        Scanner SC = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print(arr.length); // no of rows
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { // individual size of row
                arr[row][col] = SC.nextInt();
            }
        }
        // output
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { // individual size of row
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}