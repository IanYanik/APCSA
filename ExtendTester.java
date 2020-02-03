public class ExtendTester {
private String test = "him";
public static void main( String[] args ){

    ExtendTester2 demo2 = new ExtendTester2();
    Thread t2 = new Thread(demo2);
    t2.start();
}

public void printTest(){
System.out.println(test);
}
}