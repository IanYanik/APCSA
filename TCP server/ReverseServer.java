import java.io.*;
import java.net.*;
import java.util.*;

 
public class ReverseServer {
static String mostRecent = " ";
    public static void main(String[] args) {
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
         
         String[] argss = {portt}; 
        if (argss.length < 1) return;
        
        int port = Integer.parseInt(argss[0]);
 
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Server is listening on port " + port);
 
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                System.out.println("1");
                new ServerThread(socket).start();
                System.out.println("2");
                new Updater(socket).start();
                System.out.println("3");
            }
 
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static void add(String newMessage){
    newMessage = mostRecent;
    }
    public static String get(){
    return mostRecent;
    }
}