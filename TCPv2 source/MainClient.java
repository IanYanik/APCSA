public class MainClient {
public static void main(String[] args){

String unprocessedConfig = FileEdit.textToString("ipConfig");
//3-17
String ip = unprocessedConfig.substring(4,18);
System.out.println(ip);
}
}