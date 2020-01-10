// Java program to create a blank text field with a  
// given initial text and given number of columns 
import java.awt.event.*; 
import javax.swing.*; 
class text extends JFrame implements ActionListener { 
    // JTextField 
    static JTextField t; 
  
    // JFrame 
    static JFrame f;
    

        
    // JButton 
    static JButton b; 
  
    // label to display text 
    static JLabel l; 
    static JLabel l2;
  
    // default constructor 
    text() 
    { 
    } 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to store text field and button 
        f = new JFrame("textfield"); 
  
        // create a label to display text 
        l = new JLabel("nothing entered");
        l2 = new JLabel("wow"); 
  
        // create a new button 
        b = new JButton("submit"); 
  
        // create a object of the text class 
        text te = new text(); 
        
        // create a seperator 
        JSeparator s = new JSeparator();
        
        // set layout as vertical 
        s.setOrientation(SwingConstants.HORIZONTAL); 
  
        // addActionListener to button 
        b.addActionListener(te); 
  
        // create a object of JTextField with 16 columns and a given initial text 
        t = new JTextField("enter the text", 16); 
  
        // create a panel to add buttons and textfield 
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(t); 
        p.add(b); 
        p.add(l);
        p.add(s);
        //p.add(l2); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(300, 300); 
  
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