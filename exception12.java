 import java.util.Scanner;
 class OddnoException extends Exception
  {
    OddnoException(String msg)
    {
        super(msg);

    }
   
}
class Odd2
{
  static void OddMethod( int num2) throws OddnoException
{
    if(num2%2!=0)
    {
        throw new OddnoException("Odd no Exception");
    }
}



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter an number");
        int num=s.nextInt();
        try{
            Odd2.OddMethod(num);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        
        
    }
}
    

