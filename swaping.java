
import java.util.*;
class Swap
{
    public static void main(String arr[])
    {
        Scanner sr=new Scanner(System.in);
        int a,b;
        System.out.println("before swapping:");
        System.out.println("enter a number");
        a=sr.nextInt();

        System.out.println("enter b number");
        b=sr.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping");
        System.out.println(a);
        System.out.println(b);

    }
}
