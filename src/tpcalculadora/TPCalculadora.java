/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpcalculadora;
import gui.Formulario;

/**
 * @author alejandro
 */
public class TPCalculadora {
  public static void main(String[] args) {
      // TODO code application logic hereX
      Formulario mainForm = new Formulario();
      mainForm.setVisible(true);
      mainForm.setLocationRelativeTo(null);
  }

  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
  }    
}
