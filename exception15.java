import java.util.Scanner;
class SpeedCrossException extends RuntimeException
{
    SpeedCrossException(String msg)
    {
        super(msg);
    }
}

class vahicle{
    int speed;
    void set_Speed( int speed){
        System.out.println("Speed of vahicle "+speed);

    }
    }
    

class Truck extends vahicle
{
    void set_speed(int speed)
    {
        System.out.println("Speed of truck "+speed);
    }

}
class submarines extends vahicle
{
    void set_Speed( int speed)
    {
        System.out.println("Speed of submarin "+speed);
    }

}
class Dreiver12{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the speed truck");
        int speed  =s.nextInt();
        vahicle v=new vahicle();
        v.set_Speed(speed);
        try{
        if(speed>150)
        {
            throw new SpeedCrossException(" Speed is high ");
        }
        else
        {
            System.out.println("enjoy your journay");
        }
      }
    catch(Exception e)
      {
        e.printStackTrace();

      }
     
      System.out.println("thanks");
     // Truck t=new Truck();
     // t.set_Speed(speed);
 }
}