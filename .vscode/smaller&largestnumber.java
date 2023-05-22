
import java.util.*;
class Vijay
{
public static void main(String arr[])
{
    System.out.println("small number 1stFunction");
    fun1();
    System.out.println("largest number 2stFunction");
    fun2();
}
static void fun1()
{
    Scanner ob=new Scanner(System.in);
    int a,b;
    System.out.println("Enter a number");
    a=ob.nextInt();

    System.out.println("Enter a number");
    b=ob.nextInt();
    if(a<b)
    {
        System.out.println("smallest="+a);

    }
else
{
    System.out.println("smallest=="+b);
}
}
    static void fun2(){
    Scanner ob=new Scanner(System.in);
    int a,b;
    System.out.println("Enter a number");
    a=ob.nextInt();

    System.out.println("Enter a number");
    b=ob.nextInt();

    if(a<b)
    {
        System.out.println("Lergest="+a);
    }
    else
    {
        System.out.println("Lergest="+b);
    }

}
}
