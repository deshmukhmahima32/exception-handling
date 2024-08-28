import java.util.Scanner;
class NegativeAreaException extends RuntimeException{
    NegativeAreaException( String msg)
    {
        super(msg);

    }
}
class shapes
{
    void readmeth()
    {
        System.out.println("method of parent class");
    }    

}
class rectangle
{

    void readmeth(int l,int b)
    {
        int area=l*b;
        
        System.out.println("Area of rectangle "+area);
        if(area<0)
        try
        {
             throw new NegativeAreaException("negative area");

        }
        catch(Exception e)
        {
            e.printStackTrace();

        }

    }
}
class areaDriver{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length ");
        int l=s.nextInt();
        System.out.println("enter breath");
        int b=s.nextInt();
        rectangle r=new rectangle();
        r.readmeth(l,b);
        
    }

}