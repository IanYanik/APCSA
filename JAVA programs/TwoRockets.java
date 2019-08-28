public class TwoRockets {
    public static void main(String args[]) 
    {
      Cone();
      Square();
      System.out.println("|United| |United|");
      System.out.println("|States| |States|");
      Square();
      Cone();
    }
    static void Square() 
    {
    System.out.println("+------+ +------+");
    System.out.println("|      | |      |");
    System.out.println("|      | |      |");
    System.out.println("+------+ +------+");
    }
    static void Cone() 
    {
    System.out.println("  / \\     / \\");
    System.out.println(" /   \\   /   \\");
    System.out.println("/     \\ /     \\");
    }
}