package TicTacToe.event;

import java.awt.event.*;
import javax.swing.*;

public class Mark{
    
    boolean turnX;

    public Mark(JButton b){
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(turnX){
                    if(b.getText().equals("")){
                        b.setText("X");
                       
                    }
                }
                else{
                    if(b.getText().equals("")){
                        b.setText("O");
                        
                    }
                }
            }
        });
        
    }
    public void setTurnX(boolean turnX){
        this.turnX = turnX;
    }
    
}