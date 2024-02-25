package akash.learning;
import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        // Array Methods
        // toString() + asList() + deepToString()
        String a[]={"Learn","Coding","Keypoint","Education"};

        System.out.println("toString()" +Arrays.toString(a));  // toString //  Use Single Dimensional Array

        System.out.println("asList()" +Arrays.asList(a));      // asList //Reference to a[] //  Use Single Dimensional Array

       int arr[][]={{10,20},{30,40}};
       System.out.println("deepToString() "+Arrays.deepToString(arr)); // deepToString // Use Multi Dimensional Array
    }

}
