import java.util.Scanner;
public class Table
{
    public static void main(String args[]) 
    {
     
     Scanner myObj = new Scanner(System.in); 
     System.out.print("How many people ate? ");
     int people = myObj.nextInt();
     double totalCost = eat(people); 
     System.out.println("Sub-total: " + totalCost);
     System.out.println("Tax: " + tax(totalCost));
     System.out.println("Tip: " + tip(totalCost));
     double realTotal = tip(totalCost) + tax(totalCost) + totalCost;
     System.out.println("Total: " + realTotal);
    }
    public static double eat(int people){
     double totalCost = 0;
     Scanner myObj = new Scanner(System.in);
     for(int i = 0; i<people; i++)
     {
     int numbers = i + 1;
     System.out.print("Person #" + numbers + ": How much did your dinner cost? ");
     totalCost = totalCost + myObj.nextDouble();
     }
     return(totalCost);
    }
    public static double tax(double total){
    return(total*0.06);
    }
    public static double tip(double total){
    return(total*0.15);
    }
    
}
