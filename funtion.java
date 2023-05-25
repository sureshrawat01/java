import java.util.*;
class Mi
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st num");
        a=ob.nextInt();

        System.out.println("Enter 2nd num");
        b=ob.nextInt();
        fun(a,b);
    }static void fun(int x,int y)
    {
        int z;
        z=x+y;
        System.out.println(z);
    }
}