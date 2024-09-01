import java.io.FileInputStream;
import java.io.FileNotFoundException;
class exceptionthrows10
{
    void readFile() throws FileNotFoundException
    {
        FileInputStream f=new FileInputStream("jgfjjhkj");
    }
    public static void main(String[] args) {
        exceptionthrows10 r=new exceptionthrows10();
        try
         {
           r.readFile();
         }
        catch(Exception e)
         {
            e.printStackTrace();
         }
    }

}