import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MessageGUI{
    static JFrame frame;
    static JLabel label;
    static String[] names = {"", "Cosmo", "Elmo", "Hugo",
                             "Jethro", "Laszlo", "Milo", "Nemo",
                             "Otto", "Ringo", "Rocco", "Rollo"};
                             
public void showGUI(){
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
      "Cosmo  ");
}
names[4] = JOptionPane.showInputDialog("num1");
public static void main(String[] args){
MessageGUI run = new MessageGUI();
run.showGUI();
}
}