import java.util.Scanner;
class cointainPositiveException extends RuntimeException{
   cointainPositiveException(){
       super();
   }
}
class positive{
   void checkpositive(int arr[])
   {
       for(int i=0;i<arr.length;i++)

       {
       
       try{
           if(arr[i]>0)
           {
               throw new cointainPositiveException();
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
   }
}
}
class exception23 {
   public static void main(String[] args) {
       int arr[]={34,-43,54,-54,87};
       positive d=new positive();
       d.checkpositive(arr); 
    }
   
}
   

   


