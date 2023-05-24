class Sinu
{

   public static void main(String arr[])
    {
      int x=  tmp(3,5);
        int y=tmp(5,6); 

        System.out.println(x+y);
    }static int tmp(int...x)
    {
        int t=0;
        for(int i:x)
        {
            t=t+i;
        }
        return t;
    }
}