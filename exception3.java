 class exception3 
 {
    public static void main(String[] args)
    {
        int arr[]={10,20,30};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        try
        {
        System.out.println(arr[3]);
        }
        catch(Exception a)
        {
          // System.out.println(a);
           a.printStackTrace();
        }
        System.out.println("Rest part");
    }
}
