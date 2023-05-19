
import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
    {
    int a[] = {2,5,3,4,7,88,11};
    int b[] =new int[10];
    int c[] =new int[10];

    System.arraycopy(a,0,b,0,length:3);
    for(int i:b)
    System.out.println(i);
    System.arraycopy(a,2,b,5,length:4);

    for(int i:c)
    System.out.print(i + " ");
    }
}
