public class NameTester {
private int test;
public static void main( String[] args ){
    NameTester myObject = new NameTester();
    myObject.him(myObject);
}
public void him(NameTester myObject){
test = 4;
NameTester2 myObject2 = new NameTester2();
myObject2.him(myObject);
}
public void getInt(){
System.out.println(test);
}

public void setInt(int set){
test = set;
}
}