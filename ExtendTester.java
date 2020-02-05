public class ExtendTester {
private String test = "him";
public static void main( String[] args ){

    /*ExtendTester2 demo2 = new ExtendTester2();
    Thread t2 = new Thread(demo2);
    t2.start();*/
    ExtendTester myObject = new ExtendTester();
    myObject.him();
}
public ExtendTester(){
}
public ExtendTester(String one){
System.out.println(one);
}
public void printTest(){
System.out.println(test);
}
public void him(){
new ExtendTester2().run();
}
}