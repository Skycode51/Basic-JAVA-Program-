package akash.learning;
import java.util.Arrays;
// Arrays Compare
// 1. ==
// 2. equals()
public class ArraysCompare
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};

        if (a==b) //Case 1. == Method // Only See Reference Variable
        {
            System.out.println("Both are Equals !!!! ");
        }
        else {
            System.out.println("Both are Not Equal");
        }
        if(Arrays.equals(a,b)) //Case 2. Equals() // Always see only Data
        {
            System.out.println("Both are Equals !!!!");
        }else {
            System.out.println("Both are Not Equals ");
        }
    }
}

