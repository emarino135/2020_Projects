package CC.action;

import java.awt.event.*;
import CC.GUI;

public class clearB implements ActionListener{
    GUI obj;
    public clearB(GUI obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.area.setText("");
        obj.result.setText("(Terminal Cleared)");
    }
}