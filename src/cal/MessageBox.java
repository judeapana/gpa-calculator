/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Jude
 */
public class MessageBox {
    
    public static void show(String message,String title,Integer dialogType){
        JOptionPane optionPane = new JOptionPane(message,dialogType);
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog
    }
}
