import java.net.*;
public class MainClient {
public static void main(String[] args){
input.main(args);
boolean loop = true;
String unset = "unset";
String unprocessedConfig;
while (loop){
unprocessedConfig = FileEdit.textToString("ipConfig");
if (!unprocessedConfig.equals(unset)){
loop = false;
}
}
unprocessedConfig = FileEdit.textToString("ipConfig");
FileEdit.writeToFile("ipConfig", unset);
String ip = unprocessedConfig.substring(4,18);
System.out.println(ip);
String port = unprocessedConfig.substring(25,29);
System.out.println(port);
int port2 = Integer.parseInt(port);
Socket socket = SocketMaker.makeSocket(ip, port2);
ClientConnect.connect(socket);
}
}