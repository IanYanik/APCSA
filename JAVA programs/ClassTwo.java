public class ClassTwo 
{
    public static void main(String args[]) 
    {
      ClassOne.nerd();
String s = "Hasta manana";
for(int i = 0; i < s.length(); i++)
{
System.out.println(s.charAt(i % 2));
}
    }
}
