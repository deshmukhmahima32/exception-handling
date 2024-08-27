import java.util.Scanner;
class NoCointainVowel extends RuntimeException {
    String msg;
        NoCointainVowel(String msg)
        {
            super(msg);
        }

     
}
class MethVowel{
    void  VolMethod( String name)

    { 
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
        
            if(ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='a'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I')
            {
             //throw new NoCointainVowel("No Cointain vowel");
             count++;
            
            }

            }
            if(count==0)
            {
                throw new NoCointainVowel("No Cointain vowel");
                
            }
            else {
                System.out.println("contain vowel");
            }
        }
    }

         
class InputVowel
{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter a String");
        String str= s.nextLine();
        MethVowel m=new MethVowel();
        try{
        m.VolMethod(str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
