
import java.util.Scanner;
class Suresh
{
public static void main (String arr[])
{
 Scanner ob = new Scanner (System.in);
 String st,str,temp;
 System.out.print("Enter first String:");
 st = ob.next();
 System.out.print("Enter second String:");
 str = ob.next();

 temp = largest (st,str);
 System.out.println(" "+temp);

}
static String largest(String x,String y)
{
 if(x.length() == y.length())
 {
  return "BOth string are equal";
 }
 else if(x.length() > y.length())
 {
  return x;
 }
 else 
 {
  return y;
 }
}

}

