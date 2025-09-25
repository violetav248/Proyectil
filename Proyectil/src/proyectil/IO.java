/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectil;

import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
import javax.swing.JOptionPane;

public class IO {
    
    public static int leerEntero(String msg) {
        int m = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return m;
    }
    
    public static double leerReal(String msg) {
        double m = Double.parseDouble(JOptionPane.showInputDialog(msg));
        return m;
    }
    
    public static String leerCadena(String msg) {
        String m = JOptionPane.showInputDialog(msg);
        return m;
    }
    
    public static void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}