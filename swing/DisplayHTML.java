package swing;
import javax.swing.*;
//import java.awt.event.*;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
//import java.awt.*;
import java.io.*;

public class DisplayHTML{
    JFrame frame;
    JTextArea area;
    //JButton button;
    URL openHtml=null;
    String reader="";
    Scanner connectHtml=null;
    private String display;

    public DisplayHTML(String link) {
        //button=new JButton("here");
        frame=new JFrame("HTML");
        area=new JTextArea("");
        area.setBounds(0,0,800,800);
        frame.add(area);
        frame.setSize(1000,1000);
        //frame.add(button);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //button.setBounds(100,150,100,30);
        reader=link;
        //String display="";
        openHTML();
    }
/*button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
openHTML();
}
});
}*/
    public void openHTML() {

        File file = new File("swing/temp.html");
        try {
        openHtml=new URL(reader);
        connectHtml=new Scanner(new InputStreamReader(openHtml.openStream()));
        while (connectHtml.hasNextLine()) {
            display=connectHtml.nextLine();
            


            }
        }
        catch(Exception e) {
        ;
        }



        }
    }