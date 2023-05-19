
    
    import java.util.*;
    class interst 
    {
         public static void main(String arr[]) 
        {
            Scanner ss =new Scanner(System.in);
            float p,r,t,si;
            System.out.print("Enter principal amount");
            p=ss.nextFloat();   

            System.out.print("Enter Rate");
            r=ss.nextFloat();
             
            System.out.print("Enter time");
            t=ss.nextFloat();
           
            si=p*r*t/100;
            System.out.print("total interst="+si);
            }
          
    }    
            