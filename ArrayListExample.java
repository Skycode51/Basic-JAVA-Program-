package akash.learning;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(8474);
        list.set(0,99);
        list.remove(3);
        System.out.println(list.contains(200));
        System.out.println(list);
     /* ----------------------------------------------------------------------*/
        //Input
        Scanner SC = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(SC.nextInt());

        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list of [index] will not work here

        }
    }
}
