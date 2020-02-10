import java.util.*;
public class Main2 {
public static void main(String[] args){
  MyList list = new MyList();
  //System.out.println(Arrays.toString(list.internalArray));
  System.out.println(list.getAdv());
  //System.out.println(list.ret());
  list.set(6,0);
  System.out.println(list.get(4));
  list.add(7);
  list.add(8);
  System.out.println(list.get(6));
}
}