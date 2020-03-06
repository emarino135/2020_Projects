package test;
import javax.swing.text.*;
import javax.swing.*;
import java.io.*;

public class test1 {

  public static void main(String[] args) {
        
    JEditorPane jep = new JEditorPane();
    jep.setEditable(false);   
    
    try {
        jep.setPage("https://en.wikipedia.org/wiki/Donald_Trump");
    }
    catch (IOException e) {
        jep.setContentType("text/html");
        jep.setText("<html>Could not load https://en.wikipedia.org/wiki/Donald_Trump </html>");
    } 
    
      
     JScrollPane scrollPane = new JScrollPane(jep);     
     JFrame f = new JFrame("Browser");
     // Next line requires Java 1.3
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.getContentPane().add(scrollPane);
     f.setSize(512, 342);
     f.setVisible(true);
    
  }

}
