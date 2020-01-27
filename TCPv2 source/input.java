// Java program to create a blank text field with a  
// given initial text and given number of columns 
import java.awt.event.*; 
import javax.swing.*;
import org.apache.commons.validator.routines.InetAddressValidator;
class input extends JFrame implements ActionListener {
/*public String IP;
public int Port;*/
    // JTextField 
    static JTextField t;
    static JTextField x; 
  
    // JFrame 
    static JFrame f;
    

        
    // JButton 
    static JButton b; 
  
    // label to display text 
    static JLabel l; 
    static JLabel l2;
  
    // default constructor 
    input() 
    { 
    } 
  
      public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static int checkValid(String IP, String port){
      int ipPassed = 0;
      int portPassed = 0;
      //Check IP
      boolean x = false;
      InetAddressValidator two = new InetAddressValidator();
      x = two.isValid(IP);
      if (x) {
			ipPassed = 1;
		}
      
      //Check port
      int intPort = Integer.parseInt(port);
      if (intPort > 2000 && intPort < 10000){
         portPassed = 1;
      }
      if (ipPassed == 1 && portPassed == 1){
      return 3;
      }
      else if (ipPassed == 1 && portPassed == 0){
      return 2;
      }
      else if (ipPassed == 0 && portPassed == 1){
      return 1;
      }
      else{
      return 0;
      }
    }

    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to store text field and button 
        f = new JFrame("Connect"); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create a label to display text 
        //l = new JLabel("nothing entered");
        //l2 = new JLabel("wow"); 
  
        // create a new button 
        b = new JButton("Connect"); 
  
        // create a object of the text class 
        input te = new input(); 
        
        // create a seperator 
        JSeparator s = new JSeparator();
        
        // set layout as vertical 
        s.setOrientation(SwingConstants.HORIZONTAL); 
  
        // addActionListener to button 
        b.addActionListener(te); 
  
        // create a object of JTextField with 16 columns and a given initial text 
        t = new JTextField("Enter IP to connect to", 16);
        x = new JTextField("Enter port to connect to", 16); 
  
        // create a panel to add buttons and textfield 
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(t); 
        p.add(x);
        p.add(b); 
        //p.add(l);
        //p.add(s);
        //p.add(l2); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(200, 125); 
  
        f.show(); 
    } 
  
    // if the vutton is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("Connect")) { 
        System.out.println("Submitted");
            //l.setText(t.getText()); 
            //t.setText("  ");
            int failed = 1;
            String ip = t.getText();
            String port = x.getText();
            
            int valid = checkValid(ip, port);
            if (valid == 3) {
            failed = 0;
            }
            if (valid == 2){
            infoBox("Invalid Port!", "Error");
            }
            if (valid == 1){
            infoBox("Invalid IP!", "Error");
            }
            if (valid == 0){
            infoBox("Invalid IP and Port!", "Error");
            }
            if (failed == 0){
            String writer = "IP: " + ip + " Port: " + port;
            FileEdit.writeToFile("ipConfig", writer);
            System.exit(0);
            /*IP = ip;
            Port = Integer.parseInt(port);*/
            }
        } 
    } 
} 