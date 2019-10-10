import java.util.Scanner;
public class Scan 
{
    public static void main(String args[]) 
    {
     Scanner myObj = new Scanner(System.in); 
     System.out.println("What is your name?");
     String name = myObj.nextLine();
     System.out.print("Your name is " + name + "?");
    }
}
