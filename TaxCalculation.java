package akash.learning;
import java.util.Scanner;    // Tax Calculation Program
public class TaxCalculation
  {
      public static void main(String[] args) {
          int salary; double tax;
          System.out.println("Enter Salary: ");
          Scanner SC= new Scanner(System.in);
          salary =SC.nextInt();
          // input Salary<=10000----> No Tax
          if (salary<=10000)
          {
              System.out.println(salary + "No TAX");
          }  // Input Salary>10000 b/w Salary<=100000---> 10% tax
          else if (salary>10000 && salary<=100000)//Logical AND
          {
              tax=salary*0.10;
              System.out.println(salary+" "+tax);
          }
          else // Input Salary> 100000 ---> 20% tax
          {
              tax=salary*0.20;
              System.out.println(salary+" "+tax);
          }
      }
}
