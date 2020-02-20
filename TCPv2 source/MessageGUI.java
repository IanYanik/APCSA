import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MessageGUI{
    static JFrame frame;
    static String[] names = {"", "Cosmo", "Elmo", "Hugo",
                             "Jethro", "Laszlo", "Milo", "Nemo",
                             "Otto", "Ringo", "Rocco", "Rollo"};
                             
public void showGUI(){
   String selectedName = ListDialog.showDialog(
      frame,
      button,
      "Baby names ending in O:",
      "Name Chooser",
      names,
      name.getText(),
      "Cosmo  ");
}
public static void main(String[] args){
MessageGUI run = new showGUI();
//run.showGUI();
}
}