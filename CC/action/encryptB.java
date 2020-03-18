package CC.action;

import java.awt.event.*;
import CC.GUI;
import java.util.*;
import java.io.*;
import CC.Encrypt;

public class encryptB implements ActionListener{
    GUI obj;
    public encryptB(GUI obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
       if(obj.area.getText().equals("")){
           obj.result.setText("Please type a message to encrypt");
       }
       else{
            try{
                //settings phrase
                String phrase = obj.area.getText();
                File file = new File("CC/phrase.txt");
                FileWriter fw = new FileWriter(file);
                fw.append(phrase);
                fw.close();
                //encrypted phrase
                Encrypt running = new Encrypt((int)obj.shift.getValue());
                running.hashCode();
                obj.result.setText(getEncryptedText());
            
            }catch(Exception ex){
                System.out.println("File not found");
            }
            
       }
        
    }
    public String getEncryptedText() throws FileNotFoundException{
        File file = new File("CC/encrypted.txt");
        Scanner sc = new Scanner(file);
        String sReturn = "";
        while(sc.hasNextLine()){
            sReturn = sReturn.concat(sc.nextLine());
        }
        sc.close();
        return sReturn;
    }   
}