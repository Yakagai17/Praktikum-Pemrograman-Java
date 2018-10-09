/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_IV;

/**
 *
 * @author Aganinggar
 */


public class Latihan_LabeledContinueStatment {
    public static void main(String[] args) {
       String names [] = {"Beah","Bianca","Lance","Beah"};
       int count = 0;
        for (int i=0;i<names.length;i++) {
            if (!names[i].equals("Beah")) {
                continue;
            }
            count++;
        }
        System.out.println("There's "+count+" 'Beah in the list");
    }    
}
