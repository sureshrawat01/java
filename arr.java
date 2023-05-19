
import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int size,i,j,c=0;
        Scanner ob= new Scanner(System.in);
         System.out.println("enter size no : ");
        size = ob.nextInt();
        int a[]= new int[size];
        System.out.println("Enter Element");
        for(i=1; i<= a.length;i++);
        {
            a[i] = ob.nextInt();
        }
        System.out.println("enter serch no : ");
        j= ob.nextInt();
            for(i=1; i<=a.length; i++)
            {
                if(j==a[i])
                {
                    c++;
                }
            }
            
         System.out.println(c);
    }
}    
