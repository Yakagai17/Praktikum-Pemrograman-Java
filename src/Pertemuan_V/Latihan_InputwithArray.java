/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_V;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Aganinggar
 */
public class Latihan_InputwithArray {
    public static void main(String[] args) {
    
        //InputwithBufferedReader();
        //InputwithJOptioPane();
    }
    
    public static void InputwithBufferedReader() {
    int[] inputNum = new int [10];
    int masukan=0;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));   
    
        for (int i = 0; i < 10; i++) {
            try {
                masukan = Integer.parseInt(input.readLine());
            } catch (IOException ex) {
                System.out.println("Error Type masukan !");
            }
            inputNum[i]=masukan;
            masukan=0;
        }
        
        System.out.println("Hasil 10 anga masukan adalah :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukan ke-"+i+" adalah : "+inputNum[i]);    
        }
        
    }
    
    public static void InputwithJOptioPane() {
      int[] inputNum= new int[10];
      int masukan=0;
      
        for (int i = 0; i < 10; i++) {
            masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Angka ke"));
            inputNum[i]=masukan;
        }
        
        System.out.println("Hasil 10 anga masukan adalah :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukan ke-"+i+" adalah : "+inputNum[i]);        }
        }
}
