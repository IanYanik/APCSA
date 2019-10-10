public class Pokemon 
{
    public static void main(String args[]) 
    {
      int hp = 60;
      int atk = 90;
      int def = 55;
      int spatk = 90;
      int spdef = 80;
      int speed = 110;
      hp = stats2(hp);
      printer(hp);
      atk = stats(atk);
      printer(atk);
      def = stats(def);
      printer(def);
      spatk = stats(spatk);
      printer(spatk);
      spdef = stats(spdef);
      printer(spdef);
      speed = stats(speed);
      printer(speed);
    }
    public static int stats(int change) 
    {
    change = change*2+5;
    return change;

    }
    public static int stats2(int hp) 
    {
      hp = hp*2+110;
      return hp;
    }
    public static void printer(int numb) 
    {
    System.out.println(numb);
    }

}


