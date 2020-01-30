import java.net.Socket;
import java.io.*;
public class SocketMaker {

public static Socket makeSocket(String ip, int port){
//try (ServerSocket serverSocket = new ServerSocket(port)) {
Socket socket = Socket();
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