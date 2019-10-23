import java.util.Random;
import java.lang.Math;
import static java.lang.Math.toIntExact;
public class LuckySeven {
Random rand = new Random();
public static void main(String args[]){
System.out.print(randInt(10,12));
}
public static int randInt(int min, int max) {
max = max - 1;
double doub = (Math.random()*((max-min)+1))+min;
long org = Math.round(doub);
int aft = toIntExact(org);
aft = (aft - 1)/10;
System.out.println(org);
System.out.print(aft);
return 1;

}
}