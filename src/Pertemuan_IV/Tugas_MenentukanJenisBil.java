/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_IV;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.EOFException;
import java.io.IOException;
/**
 *
 * @author Aganinggar
 */
public class Tugas_MenentukanJenisBil {
    public static void main(String[] args) {
        
        BufferedReader bilIn = new BufferedReader(new InputStreamReader(System.in));
        String bilangan = "";
        System.out.print("Masukan bilangan yang ingin anda tentukan jenisnya : ");
        
        try {
            bilangan = bilIn.readLine();
        } catch (IOException e) {
            System.out.println("Erorr!");
        }
        
        double inputBil = Double.parseDouble(bilangan);
        
        if(inputBil==0){
            System.out.println("Bilangan  '"+bilangan+"' = Bilangan Nol");
        }
        else if (((inputBil%1)==1)||((inputBil%1)==0)) {
            if (inputBil>0) {
                System.out.println("Bilangan  '"+bilangan+"' = Bilangan Bulat positif");
            }
            else{
                System.out.println("Bilangan  '"+bilangan+"' = Bilangan Bulat negatif");
            } 
        }
        else{
            if (inputBil>0) {
                System.out.println("Bilangan  '"+bilangan+"' = Bilangan Pecahan positif");
            }
            else{
                System.out.println("Bilangan  '"+bilangan+"' = Bilangan Pecahan negatif");
            }
        }
    }    
}
