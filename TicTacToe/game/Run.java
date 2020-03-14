package game;

import javax.swing.*;
import game.action.*;
public class Run{
    static JFrame frame;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton b6;
    static JButton b7;
    static JButton b8;
    static JButton b9;
    Mark b1_a; 
    Mark b2_a; 
    Mark b3_a;
    Mark b4_a;
    Mark b5_a;
    Mark b6_a;
    Mark b7_a;
    Mark b8_a;
    Mark b9_a;
    int reply;
    String message;
    public static void main(String [] args){
        Run tester = new Run();
        tester.hashCode();
    }
    public Run(){
        buildBoard();
        while(true){
            
        
            while(gamePlaying()){
                oTurn();
            }
            Replay();
            clearBoard();
            
        }
        
       
    }
    public void Replay(){
        int reply = JOptionPane.showConfirmDialog(null,message,"Replay",JOptionPane.YES_NO_OPTION);
        if(reply == 1){
            System.exit(0);
        }
    }
    
    public void clearBoard(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
    public void buildBoard(){
        //initiating JComponnents 
        frame = new JFrame("TicTacToe");
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");
        //JFRAME settings
            frame.setLayout(null);
            frame.setSize(316,340);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(500,500);
            //addCOmponents to JFrame
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);
            frame.add(b6);
            frame.add(b7);
            frame.add(b8);
            frame.add(b9);
        //JOptionPane settings
           
        //JButton Settings
            b7.setBounds(0,0,100,100);
            b8.setBounds(100,0,100,100);
            b9.setBounds(200,0,100,100);
            b4.setBounds(0,100,100,100);
            b5.setBounds(100,100,100,100);
            b6.setBounds(200,100,100,100);
            b1.setBounds(0,200,100,100);
            b2.setBounds(100,200,100,100);
            b3.setBounds(200,200,100,100); 
            //JButton adding behavior
            b1_a = new Mark(b1);
            b2_a = new Mark(b2);
            b3_a = new Mark(b3);
            b4_a = new Mark(b4);
            b5_a = new Mark(b5);
            b6_a = new Mark(b6);
            b7_a = new Mark(b7);
            b8_a = new Mark(b8);
            b9_a = new Mark(b9);
    }
    public void oTurn(){
        int countX = 0; //x ==true
        int countO = 0;
        
        if(b1.getText().equals("X")) countX++;
        if(b2.getText().equals("X")) countX++;
        if(b3.getText().equals("X")) countX++;
        if(b4.getText().equals("X")) countX++;
        if(b5.getText().equals("X")) countX++;
        if(b6.getText().equals("X")) countX++;
        if(b7.getText().equals("X")) countX++;
        if(b8.getText().equals("X")) countX++;
        if(b9.getText().equals("X")) countX++;

        if(b1.getText().equals("O")) countO++;
        if(b2.getText().equals("O")) countO++;
        if(b3.getText().equals("O")) countO++;
        if(b4.getText().equals("O")) countO++;
        if(b5.getText().equals("O")) countO++;
        if(b6.getText().equals("O")) countO++;
        if(b7.getText().equals("O")) countO++;
        if(b8.getText().equals("O")) countO++;
        if(b9.getText().equals("O")) countO++;

        if(countX > countO){
            b1_a.setOTurn(true);//It's now O's turn
            b2_a.setOTurn(true);
            b3_a.setOTurn(true);
            b4_a.setOTurn(true);
            b5_a.setOTurn(true);
            b6_a.setOTurn(true);
            b7_a.setOTurn(true);
            b8_a.setOTurn(true);
            b9_a.setOTurn(true);
        }
        else{ //It's now X's turn
            b1_a.setOTurn(false);
            b2_a.setOTurn(false);
            b3_a.setOTurn(false);
            b4_a.setOTurn(false);
            b5_a.setOTurn(false);
            b6_a.setOTurn(false);
            b7_a.setOTurn(false);
            b8_a.setOTurn(false);
            b9_a.setOTurn(false);
        }
    }
    public boolean gamePlaying(){
        //X wins
        //Horizontal win
        if(b7.getText().equals("X")&&b8.getText().equals("X")&&b9.getText().equals("X")||
        b4.getText().equals("X")&&b5.getText().equals("X")&&b6.getText().equals("X")||
        b7.getText().equals("X")&&b8.getText().equals("X")&&b9.getText().equals("X")){
            message = "X Won! Rematch?";
            return false;
        }
        //verticle win
        else if(b1.getText().equals("X")&&b4.getText().equals("X")&&b7.getText().equals("X")||
        b2.getText().equals("X")&&b5.getText().equals("X")&&b8.getText().equals("X")||
        b3.getText().equals("X")&&b6.getText().equals("X")&&b9.getText().equals("X")){
            message = "X Won! Rematch?";
            return false;
        }
        //diagnal win
        else if(b1.getText().equals("X")&&b5.getText().equals("X")&&b9.getText().equals("X")||
        b3.getText().equals("X")&&b5.getText().equals("X")&&b7.getText().equals("X")){
            message = "X Won! Rematch?";
            return false;
        }
        //O wins
        //Horizontal win
        else if(b7.getText().equals("O")&&b8.getText().equals("O")&&b9.getText().equals("O")||
        b4.getText().equals("O")&&b5.getText().equals("O")&&b6.getText().equals("O")||
        b7.getText().equals("O")&&b8.getText().equals("O")&&b9.getText().equals("O")){
            message = "O Won! Rematch?";
            return false;
        }
        //verticle win
        else if(b1.getText().equals("O")&&b4.getText().equals("O")&&b7.getText().equals("O")||
        b2.getText().equals("O")&&b5.getText().equals("O")&&b8.getText().equals("O")||
        b3.getText().equals("O")&&b6.getText().equals("O")&&b9.getText().equals("O")){
            message = "O Won! Rematch?";
            return false;
        }
        //diagnal win
        else if(b1.getText().equals("O")&&b5.getText().equals("O")&&b9.getText().equals("O")||
        b3.getText().equals("O")&&b5.getText().equals("O")&&b7.getText().equals("O")){
            message = "O Won! Rematch?";
            return false;
        }
        //draw condition
        else if(!b1.getText().equals("")&&!b2.getText().equals("")&&!b3.getText().equals("")&&
        !b4.getText().equals("")&&!b5.getText().equals("")&&!b6.getText().equals("")&&
        !b7.getText().equals("")&&!b8.getText().equals("")&&!b9.getText().equals("")){
            message = "ITS A DRAW! Play again?";
            return false;
        }
        else{
            return true;
        }

    }
}