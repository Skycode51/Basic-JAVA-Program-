package akash.learning;
import java.util.Scanner;
                        //Simple if Statement//
public class IfExample {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age: ");
        Scanner SC= new Scanner(System.in);
        age =SC.nextInt();
        if (age>=18){
            System.out.println("Eligible for votes..!");
        }
        System.out.println("thank You..!!");
    }


}
