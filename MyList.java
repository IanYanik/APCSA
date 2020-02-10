public class MyList {
  //Trouble remebering how to make new arrays
//private int[] internalArray = new int[5];
private int[] internalArray = {1,2,3,4,5};

public double getAdv(){
  int total = 0;
for(int i = 0; i < internalArray.length; i++){
total = total + internalArray[i];
}
double returner = total / internalArray.length;
return returner;
}
public void set(int num, int place){
  internalArray[place] = num;
}
public int get(int place){
  return internalArray[place];
}
public void add(int num){
  int len = internalArray.length+1;
  int[] internalArray2 = new int[len];
  for(int i = 0; i < internalArray.length; i++){
    internalArray2[i] = internalArray[i];
}
internalArray2[len-1] = num;
internalArray = internalArray2;
}
}