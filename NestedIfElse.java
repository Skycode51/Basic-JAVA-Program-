package akash.learning;
           // Nested if else Statement //
public class NestedIfElse {
    public static void main(String[] args) {
        int a=10,b=20,c=30; //Find Bigger Value
        if (a>c) {
            if (a>c){
                System.out.println(a);
            }
              else {
                System.out.println(c);
            }
        }
        else {
            if (b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
