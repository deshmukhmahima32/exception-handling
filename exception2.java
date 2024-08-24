import java.io.FileInputStream;
import java.io.FileNotFoundException;

class exception2 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream f1=new FileInputStream("d./ahdj.txt");
        }
        catch(FileNotFoundException | ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
