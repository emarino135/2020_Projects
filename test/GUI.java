package test;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class GUI{

    public static void main(String [] args) throws FileNotFoundException{
        
        String html = "";
        File file = new File("test/example.html");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            html = html.concat(sc.nextLine());
        }
        sc.close();

        JEditorPane editor = new JEditorPane("text/html", html);
        editor.setEditable(false);
        
        JScrollPane pane = new JScrollPane(editor);
        JFrame f = new JFrame("HTML Demo");
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(pane);
        f.setSize(800, 600);
        f.setVisible(true);

    }
}