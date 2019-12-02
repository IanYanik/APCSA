import java.io.*;
import java.net.*;
import java.util.*;
public class RunnableChecker implements Runnable {
public RunnableChecker(String ipp, String portt){
String[] argss = {ipp, portt};
        if (argss.length < 2) return;
 
        String hostname = argss[0];
        int port = Integer.parseInt(argss[1]);
 
        try (Socket socket = new Socket(hostname, port)) {
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
 
            Console console = System.console();
            String text;
 
            do {
                //System.out.println("1");
                text = console.readLine("Enter text: ");
                //System.out.println("2");
                writer.println(text);
                //System.out.println("3");
                InputStream input = socket.getInputStream();
                //System.out.println("4");
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                //System.out.println("5");
                String time = reader.readLine();
                //System.out.println("6");
                System.out.println(time);
                //System.out.println("7");
            } while (!text.equals("bye"));
 
            socket.close();
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
}
public void run(){
System.out.println("test");
} 
}