/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectil;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class IO {
    public static int readInt(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    
    public static double readDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }
    
    public static String readString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    public static void show(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
