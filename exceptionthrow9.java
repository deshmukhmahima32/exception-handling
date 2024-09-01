 
 import java.util.Scanner;
 class YoungerAgeException extends RuntimeException
 {
    YoungerAgeException(String msg)
    {
        super(msg);
    }
 }
 class exceptionthrow9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the age");
        int age=s.nextInt();
        try
        {
           if(age<18)
              {
                 throw new YoungerAgeException("You are not eligible for vote");

              }
           else
              {
                 System.out.println("You are eligible for vote");
              }
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
}
