import java.io.*;
import java.net.*;
import java.util.*;
public class Updater implements Runnable {
public Updater(Socket socket){
//ipp = "206.57.167.141";
//portt = "9090";
//String[] argss = {ipp, portt};
//String hostname = argss[0];
//int port = Integer.parseInt(argss[1]);
 
        try {
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
 
            Console console = System.console();
            String text;
 
            do {
                //System.out.println("1");
                //text = console.readLine("Enter text: ");
                //System.out.println("2");
                FileEdit.textToString("convo");
                //writer.println("test");
                //System.out.println("3");
                //InputStream input = socket.getInputStream();
                //System.out.println("4");
                //BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                //System.out.println("5");
                //String time = reader.readLine();
                //System.out.println("6");
                //System.out.println(time);
                //System.out.println("7");
            } while (true);
 
            //socket.close();
 
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