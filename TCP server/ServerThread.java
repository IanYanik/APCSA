import java.io.*;
import java.net.*;
 
public class ServerThread extends Thread {
    private Socket socket;
 
    public ServerThread(Socket socket) {
        this.socket = socket;
    }
 
    public void run() {
    //Thread t1 = new Thread(new RunnableChecker (socket));
    //t1.start();
   //Runnable r = new Updater(socket);
   System.out.println("one");
   // MyThread myThread = new MyThread();
  //myTread.start();
   
   System.out.println("two");
   //new Thread(r).start();
   //System.out.println(socket);
    String none = " ";
        try {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
 
 
            String text;
 
            do {
                //System.out.println("1");
                System.out.println("start");
                text = reader.readLine();
                //System.out.println("2");
                //String reverseText = new StringBuilder(text).reverse().toString();
                //System.out.println("3");
                //writer.println(FileEdit.textToString("Convo"));
                System.out.println("New message");
                //writer.println("Message Recieved");
                //System.out.println("4");
                FileEdit.writeToFile("Convo", text);
               // System.out.println("5");
            } while (!text.equals("bye"));
 
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}