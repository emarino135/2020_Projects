/*
    Thread 2
*/
package TicTacToe;

import javax.swing.*;
import TicTacToe.event.*;
import TicTacToe.*;

public class T2 extends Thread{
    public void run() 
    { 
        try{ 
                int countX;
                int countO;
            
            Mark b1_a = new Mark(b1);
                b1_a.hashCode();
            Mark b2_a = new Mark(b2);
                b2_a.hashCode();
            Mark b3_a = new Mark(b3);
                b3_a.hashCode();
                    
            Mark b4_a = new Mark(b4);
                b4_a.hashCode();
            Mark b5_a = new Mark(b5);
                b5_a.hashCode();
            Mark b6_a = new Mark(b6);
                b6_a.hashCode();

            Mark b7_a = new Mark(b7);
                b7_a.hashCode();
            Mark b8_a = new Mark(b8);
                b8_a.hashCode();
            Mark b9_a = new Mark(b9);
                b9_a.hashCode();
            
            while(true){ //until game ends
                
                countX = 0;
                countO = 0;
                
                //COUNT X'S
                if(b1.getText().equals("X")){
                    countX++;
                }
                if(b2.getText().equals("X")){
                    countX++;
                }
                if(b3.getText().equals("X")){
                    countX++;
                }
                if(b4.getText().equals("X")){
                    countX++;
                }
                if(b5.getText().equals("X")){
                    countX++;
                }
                if(b6.getText().equals("X")){
                    countX++;
                }
                if(b7.getText().equals("X")){
                    countX++;
                }
                if(b8.getText().equals("X")){
                    countX++;
                }
                if(b9.getText().equals("X")){
                    countX++;
                }
                //COUNT O's
                if(b1.getText().equals("O")){
                    countO++;
                }
                if(b2.getText().equals("O")){
                    countO++;
                }
                if(b3.getText().equals("O")){
                    countO++;
                }
                if(b4.getText().equals("O")){
                    countO++;
                }
                if(b5.getText().equals("O")){
                    countO++;
                }
                if(b6.getText().equals("O")){
                    countO++;
                }
                if(b7.getText().equals("O")){
                    countO++;
                }
                if(b8.getText().equals("O")){
                    countO++;
                }
                if(b9.getText().equals("O")){
                    countO++;
                }
                
                //Setting turn
                
                if(countX<=countO){
                    b1_a.setTurnX(true);
                    b2_a.setTurnX(true);
                    b3_a.setTurnX(true);
                    b4_a.setTurnX(true);
                    b5_a.setTurnX(true);
                    b6_a.setTurnX(true);
                    b7_a.setTurnX(true);
                    b8_a.setTurnX(true);
                    b9_a.setTurnX(true);
                    System.out.print("");
                    
                }else{
                    b1_a.setTurnX(false);
                    b2_a.setTurnX(false);
                    b3_a.setTurnX(false);
                    b4_a.setTurnX(false);
                    b5_a.setTurnX(false);
                    b6_a.setTurnX(false);
                    b7_a.setTurnX(false);
                    b8_a.setTurnX(false);
                    b9_a.setTurnX(false);
                    
                }
            }
            
        } 
        catch (Exception e) 
        { 
            
            System.out.println ("Exception is caught"); 
        } 
    } 
}