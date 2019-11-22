import java.util.ArrayList;
public class QuestionTester
{
	public static void main(String[] args)
  { 
  String[] names = {"Jake", "April", "Oliver", "Nora", "Harper", "Sebastian", "Matthew", "Eleanor", "Christopher"};
  ReverseNames(names);
  }
  
  public static void ReverseNames(String[] names){
  ArrayList<String> reversed = new ArrayList<String>();
        for (int i = 0; i < 9; i++){
        reversed.add(names[i]);
  }
    for (int i = 0; i < 9; i++){
  reversed.add(reversed.size()-i, names[i]);
  }
  System.out.println(reversed.get(3));
  System.out.println(reversed);
  }
  
}