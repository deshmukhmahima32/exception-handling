 class exception4 
{
    public static void main(String[] args)
     /*{
        String name=null;
        System.out.println(name.length());
        
       }*/
    {
        String name=null;
        try
        {
           System.out.println(name.length());
        }
        catch(Exception a)
        {
            a.printStackTrace();
        }
    }
}
