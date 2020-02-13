import java.net.*;
import java.io.*;
import java.util.*;
public class ClientConnect {
OutputStream output;
PrintWriter writer;
Console console;
Socket socket;
public void connect(Socket socket2){
socket = socket2;
try{
output = socket.getOutputStream();
writer = new PrintWriter(output, true);
console = System.console();
} catch (UnknownHostException ex) {
System.out.println("Server not found: " + ex.getMessage());
} catch (IOException ex) { 
System.out.println("I/O error: " + ex.getMessage());
}
InputStream input;
while(!input.equals("bye")){
input = socket.getInputStream();
BufferedReader reader = new BufferedReader(new InputStreamReader(input));
}
}
public void sendMessage(String message){
try{
if(message.equals("bye")){
socket.close();
}
}
catch(Exception e) {
System.out.println("Oh no");
}
writer.println(message);
}
}