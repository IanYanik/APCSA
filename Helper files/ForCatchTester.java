import java.util.Scanner;
public class ForCatchTester {
public static void main(String args[]){
ForCatchTester obj = new ForCatchTester();
int looper = 1;
while(looper == 1){
looper = obj.tryer();
}
}
public int tryer(){
Scanner myObj = new Scanner(System.in);
System.out.print("Enter value: ");
int loop = 0;
try {
boolean saveLoad = myObj.nextBoolean();
}
catch(Exception e) {
System.out.println("Non-boolean entered");
loop = 1;
}
return loop;
}

}