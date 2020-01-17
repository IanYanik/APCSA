public class MainClient {
public static void main(String[] args){
input.main(args);
String unprocessedConfig = FileEdit.textToString("ipConfig");
String ip = unprocessedConfig.substring(4,18);
if (args.length >= 1){
System.out.println(ip);
}
}
}