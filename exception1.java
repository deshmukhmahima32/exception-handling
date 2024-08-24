class exception
{
    public static void main(String[] args) 
    {
        System.out.println("Hello Infobeans Foundation");
        System.out.println("Hello java");
        try
        {
        System.out.println(10/0);
        System.out.println("mahi");//this line does not give any output  because after risky line compiler switch on the catch block 
        }
        catch(Exception h)
      //  catch(ArithmeticException h) in it we give the particular exception name
        {
          //  System.out.println(h);
          h.printStackTrace();
        // h.toString();
       // h.getMessage();
        }
        System.out.println("Mahima");
    }
} 