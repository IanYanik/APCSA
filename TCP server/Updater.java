import java.io.*;
import java.net.*;
import java.util.*;
public class Updater extends Thread {
public Updater(Socket socket){
//System.out.println("One");
//ipp = "206.57.167.141";
//portt = "9090";
//String[] argss = {ipp, portt};
//String hostname = argss[0];
//int port = Integer.parseInt(argss[1]);
         try {
         //System.out.println("Two");
            InputStream input = socket.getInputStream();
            //System.out.println("3");
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 //System.out.println("4");
            OutputStream output = socket.getOutputStream();
            //System.out.println("5");
            PrintWriter writer = new PrintWriter(output, true);
 //System.out.println("6");
 
            String text;
 
            do {
                //System.out.println("1");
                //text = reader.readLine();
                //System.out.println("2");
                //String reverseText = new StringBuilder(text).reverse().toString();
                //System.out.println("3");
                //writer.println(FileEdit.textToString("Convo"));
                //writer.println("Bzz");
                writer.println(FileEdit.textToString("Convo"));
                //System.out.println(output);
                //System.out.println("4");
                //FileEdit.writeToFile("Convo", text);
               // System.out.println("5");
            } while (true);
 
            //socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }}
public void run(){
System.out.println("test");
} 
}