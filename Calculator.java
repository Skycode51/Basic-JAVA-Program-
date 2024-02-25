package akash.learning;
import java.util.Scanner;
//Calculate Program Without Switch Statement
public class Calculator {
          public static void main(String[] args) {
           int n1,n2,ch,cal;
              System.out.println("Enter Any Two Digit: ");
              //System is Default Package no need to import
              Scanner SC= new Scanner(System.in);
              n1 =SC.nextInt();
              n2 =SC.nextInt();
              System.out.println("Select Operation:");
              ch=SC.nextInt();
              if (ch==1){
                  cal=n1+n2;
                  System.out.println("Addition"+ cal);
              } else if (ch==2) {
                  cal=n1-n2;
                  System.out.println("Subtraction"+ cal);
              } else if (ch==3) {
                  cal=n1*n2;
                  System.out.println("Multiplication"+ cal);
              }else {
                  cal=n1%n2;
                  System.out.println("Reminder"+ cal);
              }
          }
      }
