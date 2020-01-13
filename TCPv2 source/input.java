// Java program to create a blank text field with a  
// given initial text and given number of columns 
import java.awt.event.*; 
import javax.swing.*; 
class input extends JFrame implements ActionListener { 
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
        if (s.equals("submit")) { 
            // set the text of the label to the text of the field 
            l.setText(t.getText()); 
            
  
            // set the text of field to blank 
            t.setText("  "); 
            
             // set layout 
             //p.setLayout(new GridLayout(0,1)); 
        } 
    } 
} 