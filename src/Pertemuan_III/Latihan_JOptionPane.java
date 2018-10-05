/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_III;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aganinggar
 */
public class Latihan_JOptionPane {
       public static void main(String[] args) {
        
        //Input from Pop Out Interfac
        /*String nama;
        nama = JOptionPane.showInputDialog("Masukan nama anda : ");
        String msg = "Hello "+ nama;
        JOptionPane.showMessageDialog(null, msg);  */
        
        //LatihanInputPersegi();
     
    
    //String Sex="";
     String[] SexOptions = {"Laki-Laki","Perempuan"};
     ImageIcon icon = new ImageIcon("PraktikumPemrogramanJava/Pertemuan_III/baseline_accessibility_new_black_18dp.png");
     String n = (String)JOptionPane.showInputDialog(null, "Apa Jenis Kelamin anda ?", "Jenis Kelamin", JOptionPane.QUESTION_MESSAGE, null, SexOptions, SexOptions[0]);
        
     // 0=yes, 1=no, 2=cancel
     if ("Laki-Laki".equals(n)) {
         int confirmLaki = JOptionPane.showConfirmDialog(null, "Apakah anda konfirmasi bahwa anda : Laki-Kali", "Konfirmasi Jenis Kelamin",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
         switch (confirmLaki) {
             case 0:
                 {
                     String msg = "Jenis Kelamin anda "+n;
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
             case 1:
                 {
                     String msg = "Jenis Kelamin anda bukan "+n;
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
             default:
                 {
                     String msg = "Jenis Kelamin anda Tidak ada ";
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
         }
        } else {
            int confirmPerempuan = JOptionPane.showConfirmDialog(null, "Apakah anda konfirmasi bahwa anda : Perempuan", "Konfirmasi Jenis Kelamin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            switch (confirmPerempuan) {
             case 0:
                 {
                     String msg = "Jenis Kelamin anda "+n;
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
             case 1:
                 {
                     String msg = "Jenis Kelamin anda bukan "+n;
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
             default:
                 {
                     String msg = "Jenis Kelamin anda Tidak ada ";
                     JOptionPane.showMessageDialog(null, msg);
                     break;
                 }
        }
     
     
    }
}
    
    //public static void LatihanInputPersegi(){
        /*String panjang = "";
        String lebar = "";
        int luas = 0;
        
        
        panjang = JOptionPane.showInputDialog("Silahkan masukan ukuran Panjang (meter) : ");
        
        lebar = JOptionPane.showInputDialog("Silahkan masukan ukuran Lebar (meter) : ");
        
        int pjg = Integer.parseInt(panjang);
        int lbr = Integer.parseInt(lebar);
        luas = pjg*lbr;
        String msg = "Luas Bangun Persegi Panjang : "+luas+ " (meter)";
        JOptionPane.showMessageDialog(null, msg);*/    
    //}
    
    //public static void LatihanInputComboBox(String[] args) {
        
    /*     String[] SexOptions = {"Laki-Laki","Perempuan"};
    ImageIcon icon = new ImageIcon("PraktikumPemrogramanJava/Pertemuan_III/baseline_accessibility_new_black_18dp.png");
    String n = (String)JOptionPane.showInputDialog(null, "Apa Jenis Kelamin anda ?", "Jenis Kelamin", JOptionPane.QUESTION_MESSAGE, null, SexOptions, SexOptions[1]);
    System.out.println(n);*/
    //} 
}   
