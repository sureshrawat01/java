import java.util.*;

class Stu{
    public static void main(String hgh[])
    {
        Scanner marks=new Scanner(System.in);
        float hindi,english,history,totle,per;

        System.out.println("Enter hindi number");
        hindi=marks.nextFloat();

        System.out.println("Enter english number");
        english=marks.nextFloat();

        System.out.println("Enterhistory number");
        history=marks.nextFloat();
        totle=hindi+english+history;
        per= totle/3;

        System.out.println("totlemarks"+totle);
        System.out.println("per"+per);


        
    }
}