package game.action;

import javax.swing.*;
import java.awt.event.*;

public class Mark{
    boolean turnO = false;
    public Mark(JButton b){
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(b.getText().equals("")){
                    if(turnO){
                        b.setText("O");
                    }
                    else{
                        b.setText("X");
                    }
                }
                
            }
        });
    }
    public void setOTurn(boolean turnO){
        this.turnO = turnO;
    }
}