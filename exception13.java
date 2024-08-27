 import java.util.Scanner;
 class DuplicateNoException extends RuntimeException{
    DuplicateNoException(){
        super();
    }
 }
 class duplicates{
    void checkduplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int k=0;k<arr.length;k++)
            {
                if(arr[i]==arr[k])
                {
                    count++;
                }
            }
        
        try{
            if(count>1)
            {
                throw new DuplicateNoException();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
 }
}
 class exception13 {
    public static void main(String[] args) {
        int arr[]={34,43,54,54,87};
        duplicates d=new duplicates();
        d.checkduplicate(arr); 
     }
    
}
    

    

