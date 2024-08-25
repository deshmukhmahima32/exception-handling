 class exception7 {
    public static void main(String[] args) 
    {
        try
        {
        int arr[]=new int[5];
        arr[5]=30/0;
        }
     /*   catch(ArithmeticException e)
        {
            System.err.println("Airthmetic exception");
        }*/
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array out of bound");
        }
       
        /*catch(Exception e)
        {
            e.printStackTrace();
           System.out.println("Parent exception occur");
        }*/

    }
    
}
