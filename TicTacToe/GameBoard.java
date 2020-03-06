package TicTacToe;

import javax.swing.*;
import TicTacToe.event.*;


public class GameBoard /*implements Runnable*/{
    
    public static void main(String [] args){
        //Tester
        GameBoard demoGame = new GameBoard();
        demoGame.hashCode();
        
        
    }
    JFrame frame = new JFrame("TicTacToe");
    //JOptionPane alertGame = new JOptionPane("Game!");
    JButton b1 = new JButton("");
    JButton b2 = new JButton("");
    JButton b3 = new JButton("");
    JButton b4 = new JButton("");
    JButton b5 = new JButton("");
    JButton b6 = new JButton("");
    JButton b7 = new JButton("");
    JButton b8 = new JButton("");
    JButton b9 = new JButton("");
    
    public GameBoard(){
        //object Constructor
        BuildBoard();
        setTurns();
        resetGame();
        //Thread t2 = new Thread(this);
        //t2.start();
        
        
        

    }
    public void resetGame(){
        
    }
    public void BuildBoard(){
        //JFrame Settings
            //add   COMPONENTS
                frame.add(b1);
                frame.add(b2);
                frame.add(b3);
                frame.add(b4);
                frame.add(b5);
                frame.add(b6);
                frame.add(b7);
                frame.add(b8);
                frame.add(b9);
            //set   APPEARANCE
                frame.setVisible(true);
                frame.setSize(500,500);
                frame.setLayout(null);
            //set   BEHAVIOR
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

        //JButton Settings
            //set   APPEARANCE
                b7.setBounds(100,100,100,100);
                b8.setBounds(200,100,100,100);
                b9.setBounds(300,100,100,100);
                b4.setBounds(100,200,100,100);
                b5.setBounds(200,200,100,100);
                b6.setBounds(300,200,100,100);
                b1.setBounds(100,300,100,100);
                b2.setBounds(200,300,100,100);
                b3.setBounds(300,300,100,100);
            //set   BEHAVIOR    
                //BEHAVIOR SET BY THREAD: T2 IN CONSTRUCTOR METHOD
        //JOptionPane
            //Set in winCondition
            

            
    }
    public void run(){
        System.out.println("running thread 2");
        setTurns();
    }
    public void setTurns(){
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
        
        
        while(gameCondition()){ //until game ends
            
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
            }//
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
                System.out.print(""); //WHILE loop breaks without this
                                        //Don't know why
                
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

    //Win condition
    public boolean gameCondition(){
        
        
            //X WIN CONDITIONS
                //Horizontal Wins X
                if(b1.getText().equals("X")&&b2.getText().equals("X")&&b3.getText().equals("X")||
                b4.getText().equals("X")&&b5.getText().equals("X")&&b6.getText().equals("X")||
                b7.getText().equals("X")&&b8.getText().equals("X")&&b9.getText().equals("X")){
                    JOptionPane.showMessageDialog(frame,"X Wins","Alert",JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
                //Verticle Wins X
                else if(b1.getText().equals("X")&&b4.getText().equals("X")&&b7.getText().equals("X")||
                b2.getText().equals("X")&&b5.getText().equals("X")&&b8.getText().equals("X")||
                b3.getText().equals("X")&&b6.getText().equals("X")&&b9.getText().equals("X")){
                    JOptionPane.showMessageDialog(frame,"X Wins","Alert",JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
                //Diagnal Win X
                else if(b1.getText().equals("X")&&b5.getText().equals("X")&&b9.getText().equals("X")||
                b3.getText().equals("X")&&b5.getText().equals("X")&&b7.getText().equals("X")){
                    JOptionPane.showMessageDialog(frame,"X Wins","Alert",JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
            //O WIN CONDITIONS
                //Horizontal Wins O
                if(b1.getText().equals("O")&&b2.getText().equals("O")&&b3.getText().equals("O")||
                b4.getText().equals("O")&&b5.getText().equals("O")&&b6.getText().equals("O")||
                b7.getText().equals("O")&&b8.getText().equals("O")&&b9.getText().equals("O")){
                    JOptionPane.showMessageDialog(frame,"O Wins","Alert",JOptionPane.WARNING_MESSAGE); 
                    return false;
                }
                //Verticle Wins O
                else if(b1.getText().equals("O")&&b4.getText().equals("O")&&b7.getText().equals("O")||
                b2.getText().equals("O")&&b5.getText().equals("O")&&b8.getText().equals("O")||
                b3.getText().equals("O")&&b6.getText().equals("O")&&b9.getText().equals("O")){
                    JOptionPane.showMessageDialog(frame,"O Wins","Alert",JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                //Diagnal Win O
                else if(b1.getText().equals("O")&&b5.getText().equals("O")&&b9.getText().equals("O")||
                b3.getText().equals("O")&&b5.getText().equals("O")&&b7.getText().equals("O")){
                    JOptionPane.showMessageDialog(frame,"O Wins","Alert",JOptionPane.WARNING_MESSAGE);
                    return false;
                }

            
            //DRAW CONDITION
                if(!b1.getText().equals("")&&!b1.getText().equals("")&&!b1.getText().equals("")&&
                !b1.getText().equals("")&&!b1.getText().equals("")&&!b1.getText().equals("")&&
                !b1.getText().equals("")&&!b1.getText().equals("")&&!b1.getText().equals("")){
                    JOptionPane.showMessageDialog(frame,"O Wins","Alert",JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                else{
                    return true;
                }



            

        
    }

    
    
}
