import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class ClientConnect {
OutputStream output;
PrintWriter writer;
Console console;
Socket socket;
BufferedReader reader;
public void connect(Socket socket2){
socket = socket2;
try{
output = socket.getOutputStream();
writer = new PrintWriter(output, true);
console = System.console();
InputStream input = socket.getInputStream();
while(!input.equals("bye")){
input = socket.getInputStream();
reader = new BufferedReader(new InputStreamReader(input));
}
} catch (UnknownHostException ex) {
JOptionPane.showMessageDialog(null, "Server not found: " + ex.getMessage());
System.out.println("Server not found: " + ex.getMessage());
} catch (IOException ex) { 
JOptionPane.showMessageDialog(null, "I/O error: " + ex.getMessage());
System.out.println("I/O error: " + ex.getMessage());
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

public String getMessage(){
String converted = "null";
try {
  converted = org.apache.commons.io.IOUtils.toString(reader);
}
catch(Exception e) {
  System.out.println("oh no, " + e.getMessage());
}
return converted;
}
}