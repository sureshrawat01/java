
import java.util.Scanner;
class calculeter
{
 public static void main(String arr[])
{
    int num1,num2,total=0;
    
Scanner ob=new Scanner(System.in)
    System.out.println("Enter a number");
    num1 = ob.next();
    
System.out.println("Enter 2nd number");
    num2 = ob.next();

    char choice;
    System.out.println("Enter your number");
    choice = ob.next().charAt(0);

    switch (choice) 
    {
     case '+':
     total=num1+num2;
     System.out.print("sum="+total);
     break;

     case '-':
     total=num1-num2;
     System.out.print("sub="+total);
     break;

     case '*':
     total=num1*num2;
     System.out.print("mul="+total);
     break;
'
     c
     Case ':
     total=num1/num2;
     System.out.print("div="/total);
     break;


    }
    }

    
 }
