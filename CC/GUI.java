package CC;
import javax.swing.*;

import javax.swing.border.TitledBorder;


import java.awt.*;


import CC.action.clearB;
import CC.action.decryptB;
import CC.action.encryptB;

public class GUI{
    public JTextArea area;
    public JTextPane result;
    public JSlider shift;
    JFrame frame;
    JButton decrypt;
    JButton encrypt;
    JButton clear;
    JScrollPane scrollPane;

    public static void main(String [] args){
        GUI tester = new GUI();
        tester.hashCode();
    }
    public GUI(){
        createGUI();
    }
    public void createGUI(){
        frame = new JFrame("Casesar's Cypher");
        area = new JTextArea("Hello World");
        decrypt = new JButton("decrypt");
        encrypt = new JButton("encrypt");
        clear = new JButton("Clear");
        shift = new JSlider();
        result = new JTextPane();
        scrollPane = new JScrollPane(result);
        //frame settings
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,800);
            frame.getContentPane().setBackground(Color.BLACK);
            //adding components
                frame.add(area);
                frame.add(decrypt);
                frame.add(encrypt);
                frame.add(clear);
                frame.add(shift);
                frame.add(scrollPane);
        //area Settings
            area.setBounds(100,10,300,90);
            area.setFont(new Font("Lucida Console",Font.PLAIN,20));
            area.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
            area.setLineWrap(true);
            area.setForeground(Color.RED);
            area.setBackground(Color.BLACK);
            area.setCaretColor(Color.RED);
        //decrypt settings
            decrypt.setBounds(300,100,100,100);
            decrypt.setForeground(Color.RED);
            decrypt.setContentAreaFilled(false);
            decrypt.setFont(new Font("Lucida Console", Font.BOLD,20));
            //decypt behavior
                decryptB decryptAction = new decryptB(this);
                decrypt.addActionListener(decryptAction);
        //encrypt settings
            encrypt.setBounds(200,100,100,100);
            encrypt.setForeground(Color.RED);
            encrypt.setContentAreaFilled(false);
            decrypt.setFont(new Font("Lucida Console", Font.BOLD,12));
            //encrypt behavior
                encryptB encryptAction = new encryptB(this);
                encrypt.addActionListener(encryptAction);

        //clear settings
            clear.setBounds(100,100,100,100);
            clear.setForeground(Color.RED);
            clear.setContentAreaFilled(false);
            clear.setFont(new Font("Lucida Console", Font.BOLD,12));
            //clear behavior
                clearB clearAction = new clearB(this);
                clear.addActionListener(clearAction);

        //shift settings
            shift.setBounds(0,100,100,400);
            shift.setBorder(BorderFactory.createTitledBorder(shift.getBorder(),
                "Shift", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, 
                new Font("Lucida Console", Font.BOLD,12), Color.RED));
            shift.setValue(0);
            shift.setMinimum(0);
            shift.setMaximum(25);
            shift.setMajorTickSpacing(1);
            shift.setPaintTicks(true);
            shift.setPaintLabels(true);
            shift.setForeground(Color.RED);
            shift.setBackground(Color.BLACK);
            shift.setOrientation(JSlider.VERTICAL);
        //result settings
            result.setFont(new Font("Lucida Console",Font.PLAIN,12));
            result.setForeground(Color.RED);
            result.setBackground(Color.BLACK);
            result.setCaretColor(Color.RED);
            result.setEditable(false);
            result.setText("\tCreated by Edwin-Marino\n"+
            "\nUse Shift Slider to shift Caesar's Cypher's Encryption" + 
            "\n\nEncrypt: Shifts each character of the given phrase by the shift value" + 
            "\n\nDecrypt: Returns all possible Caesar Cypher Shifts"+
            "\n\nWorks only with upper and lowercase Alphabetical Characters!");

            
        //scrollBar setteings
            scrollPane.setBounds(100,205,300,500);
           
    }
}