 import java.sql.*;
 class excepption5
{
    public static void main(String[] args)/*  {
        Class.forName("com.mysql.jdbc.Driver");
    }*/
    {
        try
        { 
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
