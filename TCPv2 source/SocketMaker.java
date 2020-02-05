import java.net.*;
import java.io.*;
public class SocketMaker {

public static Socket makeSocket(String ip, int port){
//try (ServerSocket serverSocket = new ServerSocket(port)) {
Socket socket = new Socket();
try {
socket = new Socket(ip, port);
System.out.println(socket);
return socket;
}
catch (Exception e) {
System.out.println("oh no");
}
return socket;
}
}