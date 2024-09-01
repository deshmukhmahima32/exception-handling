class Throws
{
    void ThrowMethod() throws ArithmeticException
    {
        System.out.println(10/2);
        System.out.println(10/0);
     

    }
}
class Thowrs2
{
    public static void main(String[] args)
    {
        Throws t=new Throws();
        try
        {
            t.ThrowMethod();
        }
        catch(Exception e){
            e.printStackTrace();

        }
        System.out.println(10/3);
    }
}
