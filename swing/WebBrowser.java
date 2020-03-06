package swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.util.*;
//import java.io.*;
public class WebBrowser {

JFrame frame;
    JMenuBar optionBar;
    JMenuItem maximize;
    JMenuItem minimize;
    JMenuItem darkmode;
    JMenu list;
    Scanner connectHtml;
    JMenuItem showHtml;
    private String readLink;

    private JButton search;
    private JTextField field;
    private JButton clearField;

    public static void main(String [] args){
        WebBrowser runBrowser = new WebBrowser();

    }
    public WebBrowser(){
    connectHtml=null;
    frame = new JFrame("Browser.v02_27");
        search = new JButton("Search");
        clearField = new JButton("Clear");
        field= new JTextField();


        //search button design
        search.setBackground(Color.BLUE);//import java.awt.Color;
        search.setOpaque(true);
        search.setForeground(Color.WHITE);
        search.setBorderPainted(false);



        search.setBounds(170,200,100,30);
        field.setBounds(95,150,250,30);
        clearField.setBounds(345,150,100,30);
        clearField.setVisible(true);
        createMenu();
        setDefault();
        frame.add(search);
        frame.add(field);
        frame.add(clearField);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openBrowser();
            }
        });
        clearField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearText();
            }
        });

    }

    public void createMenu(){

        optionBar=new JMenuBar();
        list=new JMenu("Options");
        maximize=new JMenuItem("Fullscreen");
        minimize=new JMenuItem("Windowed");
        darkmode = new JMenuItem("Enable DarkMode");
        showHtml = new JMenuItem("HTML");


        list.add(maximize);
        list.add(minimize);
        list.add(darkmode);
        list.add(showHtml);
        optionBar.add(list);
        maximize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                maxOutScr();
                maximize.setVisible(false);
                minimize.setVisible(true);
            }
        });
        minimize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                minimizeScr();
                maximize.setVisible(true);
                minimize.setVisible(false);
            }
        });
        darkmode.addActionListener(new ActionListener(){
            boolean lightMode = true;
            public void actionPerformed(ActionEvent e){
//enable/disable darkmode
                if(lightMode){
                    frame.getContentPane().setBackground(Color.BLACK);
                    lightMode = false;
                    darkmode.setText("Enable LightMode");
                }
                else{
                    frame.getContentPane().setBackground(Color.WHITE);
                    lightMode = true;
                    darkmode.setText("Enable DarkMode");
                }

            }
        });
        showHtml.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(field.getText().contains("https://www.")&&field.getText().contains(".com"))
                {
                readLink=field.getText();

                new DisplayHTML(readLink).openHTML();
                }
            }
        });
        frame.setJMenuBar(optionBar);
    }


    public void maxOutScr(){
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public void minimizeScr(){
        frame.setSize(500,500);
    }

    public void setDefault(){
        minimize.setVisible(false);
        maximize.setVisible(true);
    }

    public void openBrowser(){
        Desktop desktop = java.awt.Desktop.getDesktop();

        try {
            if(field.getText().length()<1){
                String link3="https://i.giphy.com/1d7F9xyq6j7C1ojbC5.gif";
                field.setText(link3);
                URI oURL3 = new URI(link3);
                desktop.browse(oURL3);

            }
            
            else{
                String link2=field.getText();
                field.setText(link2);

                URI oURL2 = new URI(link2);
                desktop.browse(oURL2);
            }
        }catch (Exception e) {
            System.out.println(e);

        }

    }

    public void clearText(){
        field.setText("");
    }

}
