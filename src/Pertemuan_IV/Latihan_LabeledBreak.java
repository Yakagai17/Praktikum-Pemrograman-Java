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
//Good for checking thing is there or not ?.
public class Latihan_LabeledBreak {
    public static void main(String[] args) {
        String names[]={"Beah","Bianca","Lance","Beah"};
        int count = 0;
        searchLabel:
        for (int i=0;i<names.length;i++) {
            if (!names[i].equals("Beah")) {
                break searchLabel;
            }
            count++;
        }
        System.out.println("There's "+count+" 'Beah' in the List");
    }    
}
