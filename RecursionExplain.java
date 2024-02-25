package akash.learning;
      //Explain Recursion
public class RecursionExplain {
    public static void main(String[] args) {  //Main Method
      RecursionExplain r =new RecursionExplain();
     int a=r.sum(10);   // Calling
        System.out.println("Sum first N natural: "+a);
    }
    int sum(int b) // b=10
    {
        if (b>0) // Yes
        {
           return b+sum(b-1); //Calling // redirect to condition
        }
        else  //b=0 //False
        {
            return 0; //return 0
        }
        //It follows LIFO (Last IN First Out) process
    }
}
