/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_model;

import javax.swing.JOptionPane;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class GestorEs {
   public void mostrarMensaje (String mensaje){
       JOptionPane.showMessageDialog(null, mensaje);
   }
   
   public int pedirEntero (String mensaje){
       int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
       return entero;
   }
   
   public String pedirString (String mensaje){
       String string = JOptionPane.showInputDialog(mensaje);
       return string;
   }
}
