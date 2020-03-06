import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MessageGUI implements Runnable{
    static JFrame frame;
    static JLabel label;
    static String[] names = {"", "Cosmo", "Elmo", "Hugo",
                             "Jethro", "Laszlo", "Milo", "Nemo",
                             "Otto", "Ringo", "Rocco", "Rollo"};
                             
public void tester(JFrame frame, JLabel label){
 /*  String selectedName = ListDialog.showDialog(
      frame,
      label,
      "Messages",
      "Name Chooser",
      names,
      "placeholder",
      "Cosmo  ");*/
      }                             
public void run(){
frame = new JFrame("Connect");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
label = new JLabel("Placeholder");
   String selectedName = ListDialog.showDialog(
      frame,
      label,
      "Messages",
      "Name Chooser",
      names,
      "placeholder",
      "Cosmo  ", false);
    String selectedNameTwo = ListDialog.showDialog(
      frame,
      label,
      "Messages",
      "Name Chooser",
      names,
      "placeholder",
      "Cosmo  ", true);

//String test;
//test = JOptionPane.showInputDialog("num1");
//JOptionPane.showMessageDialog(null, "test", JOptionPane.PLAIN_MESSAGE);
//JOptionPane.showInputDialog("num1")
System.exit(0);
}
public static void main(String[] args){
//MessageGUI runer = new MessageGUI();
//runner.run();
Thread t = new Thread();
t.start();
/*run.showGUI();
names[4] = JOptionPane.showInputDialog("num1");
run.showGUI();*/
//System.exit(0);
}
}