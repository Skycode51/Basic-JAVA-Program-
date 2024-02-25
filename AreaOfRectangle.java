package akash.learning;
import java.util.Scanner;
                       // Area of Rectangle Program
public class AreaOfRectangle {
         public static void main(String[] args) {
             int l,b,area;
             System.out.println("Enter Value for Sides: ");
             Scanner SC= new Scanner(System.in);
             l=SC.nextInt();
             b=SC.nextInt();
             //Formula = Length*breath
             area=l*b;
             System.out.println("Area of rectangle"+ area);
         }
}
