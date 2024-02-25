package akash.learning;
  // Find the greatest among Three
public class FindGreatestAmongThree
{
    public static void main(String[] args)
    {
      int a=10,b=20,c=30;
      if (a>b) // 10>20
      //Multiple Statement Required curly Bracket
      {
          if (a>c)
              //Single Statement does not need curly Bracket
              System.out.println(a);
          else
              System.out.println(c);
      }
      else {
          if (a>c) //20>30
              System.out.println(b);
          else
              System.out.println(c);
      }
    }
}
