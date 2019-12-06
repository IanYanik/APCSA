import java.net.*;
import java.io.*;
import java.util.*;
 
public class ReverseClient {
 
    public static void main(String[] args) {
    String[] argss = {"localhost", "9090"};
    Scanner myObj = new Scanner(System.in);
    int loop = 1;
    String portt = "9090";
    while (loop == 1){
    System.out.print("Enter Port: ");
    portt = myObj.nextLine();
    int result = Integer.parseInt(portt);
    //System.out.println(result);
    if (result >= 2000 && result <= 9999){
    loop = 0;
    }
    else {
    System.out.println("Please enter a valid port number: (2000-9999).");
    }
    }
    argss[1] = portt;
   //Thread t1 = new Thread(new RunnableChecker ());
   //t1.start();
   //Runnable r = new RunnableChecker(argss[0], argss[1]);
   //new Thread(r).start();
        if (argss.length < 2) return;
 
        String hostname = argss[0];
        int port = Integer.parseInt(argss[1]);
 
        try (Socket socket = new Socket(hostname, port)) {
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
 
            Console console = System.console();
            String text = "null";
 
            do {
                text = console.readLine("Enter text: ");
               
                writer.println(text);
                
                InputStream input = socket.getInputStream();
               
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                String time = reader.readLine();
               
                System.out.println(time);
                
            } while (!text.equals("bye"));
 
            socket.close();
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}