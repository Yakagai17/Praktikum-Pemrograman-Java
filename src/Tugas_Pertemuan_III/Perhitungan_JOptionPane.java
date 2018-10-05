/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_III;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Aganinggar
 */
public class Perhitungan_JOptionPane {
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Perhitungan_JOptionPane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Perhitungan_JOptionPane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Perhitungan_JOptionPane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Perhitungan_JOptionPane.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int rata = 0;
        String num1 = JOptionPane.showInputDialog("Inputan Angka ke-1");
        String num2 = JOptionPane.showInputDialog("Inputan Angka ke-2");
        String num3 = JOptionPane.showInputDialog("Inputan Angka ke-3");
        
        int nu_1 = Integer.parseInt(num1);
        int nu_2 = Integer.parseInt(num2);
        int nu_3 = Integer.parseInt(num3);
        
        rata = ((nu_1+nu_2+nu_3)/3);
        String msg ="Rata-Rata : "+rata;
        JOptionPane.showMessageDialog(null, msg);
    }
}
