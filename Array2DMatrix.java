package akash.learning;
import java.util.Arrays;
import java.util.Scanner;

public class Array2DMatrix {
    public static void main(String[] args) {
        // Array 2D Matrix with [1,2,3] , [4,5,6], [7,8,9]

        // input
        Scanner SC = new Scanner(System.in);
        int [][] arr =  new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr [row][col] = SC.nextInt();
            }
        }
        // output
       // for (int row = 0; row < arr.length; row++) {
       //     System.out.println(Arrays.toString(arr[row]));
       //   }

        // Short output
         for(int[] a : arr){
             System.out.println(Arrays.toString(a));
         }
        }
    }

