import java.util.Scanner;

 class internalMarkExceedException extends RuntimeException
{
    internalMarkExceedException (String msg1)
    {
        super(msg1);
    }
}
class externalMarksExceedException extends RuntimeException
{
    externalMarksExceedException( String msg)
    {
        super(msg);
    }
}
class  driverEx
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter inter marks");
         int interMarks=s1.nextInt();
         System.out.println("enter external mark");
         int externalMarks=s1.nextInt();
         try
         {
         if(interMarks>40)
         {
            throw new internalMarkExceedException("intenal mark is exceeds");
         }
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try{
        if(externalMarks>60)
        {
            throw new externalMarksExceedException("external mark is exceeds");
        }
        
    }
    catch(Exception e1)
    {
        e1.printStackTrace();
    }
}
}


