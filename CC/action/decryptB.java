package CC.action;

import java.awt.event.*;
import CC.GUI;
import java.io.*;
import java.util.*;
import CC.Decrypt;

public class decryptB implements ActionListener {
    GUI obj;
 
    public decryptB(GUI obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e) {
        if(obj.area.getText().equals("")){
            obj.result.setText("Please type a message to Decrypt");
        }
        else{
            try{
                File file = new File("CC/Encrypted.txt");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.append(obj.area.getText());
                fileWriter.close();
                Decrypt running = new Decrypt();
                running.hashCode();
    
                obj.result.setText(readDecryptedTxt());
            }catch(Exception ex){
                System.out.println("File Not Found");
            }
            
        }
    }
    public String readDecryptedTxt() throws FileNotFoundException{
        File file = new File("CC/decrypted.txt");
        Scanner sc = new Scanner(file);
        String returnString = "";

        while(sc.hasNextLine()){
            returnString = returnString.concat(sc.nextLine()+"\n");
        }
        sc.close();
        return returnString;
    }
}