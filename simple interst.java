
    import java.util.*;
    class interst 
    {
         public static void main(String aaa[]) 
        {
            Scanner ss= new Scanner(System.in);
            float p,r,t,si;
            System.out.println("Enter principal amount");
            p=ss.nextFloat();

            System.out.println("Enter Rate");
            r=ss.nextFloat();
             
            System.out.println("Enter time");
            t=ss.nextFloat();
           
            si=p*r*t/100;
            System.out.println("total interst="+si);
            }
          
      
            
        }
    